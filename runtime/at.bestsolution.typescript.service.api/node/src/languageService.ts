/// <reference path="../typings/typeScriptServices.d.ts" />

function readFileContents(fileName: string) {
        var fs = require("fs");
        var options = { encoding: "utf8" };

        return fs.readFileSync(fileName, options);
    }

namespace TypeScriptServiceAPI {
	// const EOL = require("os").EOL;
    
    export class ServiceDispatcher {
        private services : { [ service : string ] : any }
		
		constructor() {
			this.services = Object.create;
			this.services["LanguageService"] = new LanguageServiceWrapper();
		}
        
        public invokeMethod(request : string) {
			var rpc : Request = JSON.parse(request) ;
			var requestId = rpc.requestId;
			var serviceInstance = this.services[rpc.service];
			var methodHandle = serviceInstance[rpc.method];
			var rv = methodHandle.apply(serviceInstance, rpc.parameters);
			
			return JSON.stringify(new Response(requestId,rv));
		}
    }
    
    export interface Request {
		requestId : number;
		service : string;
		method : string;
		parameters : any[]
	}
	
	export class Response {
		requestIdRef : number;
		result : any;
		
		constructor(requestIdRef : number, result : any) {
            this.requestIdRef = requestIdRef;
            if( result == undefined ) {
                this.result = null;
            } else if( result.constructor === Array ) {
				this.result = result;
			} else {
				this.result = result;
			}
		}
	}

	export class LanguageServiceWrapper {
        private projectCounter : number = 0;
		private projectMap : { [id : string] : Project } = {};

		constructor() {
			console.log("Createing Language Service Wrapper");
		}

        public createProject(name : string,
                compilationSettings: ts.CompilerOptions) {
            console.log("Createing new project '"+name+"'");
            var id = "p_" + (this.projectCounter++);
            this.projectMap[id] = new Project(id, name);
            return id;
        }

        public initProject( projectId : string, compilerOptions : ts.CompilerOptions, fileList : string[] ) : string[] {
            return this.projectMap[projectId].initProject( compilerOptions, fileList );
        }
        
        public open(projectId : string, filePath : string) {
            this.projectMap[projectId].open( filePath );
        }
        
        public close(projectId : string, filePath : string) {
            this.projectMap[projectId].close( filePath );
        }

        public addFile(projectId : string, filePath : string) {
            return this.projectMap[projectId].addFile( filePath );
        }
        
        public removeFile(projectId : string, fileId : string) {
            return this.projectMap[projectId].removeFile( fileId );
        }
        
        public modifyContent(projectId : string, fileId : string, offset: number, length: number, text: string) {
            return this.projectMap[projectId].modifyContent(fileId,offset,length,text);
        }

        public getNavigationBarItems(projectId: string, fileId: string) : ts.NavigationBarItem[] {
            return this.projectMap[projectId].getNavigationBarItems(fileId);
        }
        
        public getCompletionsAtPosition(projectId: string, fileId: string, position: number) : ts.CompletionInfo {
            return this.projectMap[projectId].getCompletionsAtPosition(fileId,position);
        }
        
        public getCompletionsAtPositionWithDetails(projectId: string, fileId: string, position: number) : CompletionInfoWithDetails {
            return this.projectMap[projectId].getCompletionsAtPositionWithDetails(fileId,position);
        }
        
        public getCompletionEntryDetails(projectId: string, fileId: string, position: number, entryName : string) : ts.CompletionEntryDetails {
            return this.projectMap[projectId].getCompletionEntryDetails(fileId,position,entryName);
        }
        
        public getOutliningSpans(projectId: string, fileId: string): ts.OutliningSpan[] {
            return this.projectMap[projectId].getOutliningSpans(fileId);
        }
        
        public getQuickInfoAtPosition(projectId: string, fileId: string, position: number): ts.QuickInfo {
            return this.projectMap[projectId].getQuickInfoAtPosition(fileId, position);
        }
        
        public getNameOrDottedNameSpan(projectId: string, fileId: string, startPos: number, endPos: number): ts.TextSpan {
            return this.projectMap[projectId].getNameOrDottedNameSpan(fileId,startPos,endPos);
        }
        
        public getBreakpointStatementAtPosition(projectId: string, fileId: string, position: number): ts.TextSpan {
            return this.projectMap[projectId].getBreakpointStatementAtPosition(fileId, position);
        }
        
        public getSignatureHelpItems(projectId: string, fileId: string, position: number): ts.SignatureHelpItems {
            return this.projectMap[projectId].getSignatureHelpItems(fileId,position);
        }
        
        public getRenameInfo(projectId: string, fileId: string, position: number): ts.RenameInfo {
            return this.projectMap[projectId].getRenameInfo(fileId, position);
        }
        
        public findRenameLocations(projectId: string, fileId: string, position: number, findInStrings: boolean, findInComments: boolean): ts.RenameLocation[] {
            return this.projectMap[projectId].findRenameLocations(fileId,position,findInStrings,findInComments);
        }
        
        public getDefinitionAtPosition(projectId: string, fileId: string, position: number): ts.DefinitionInfo[] {
            return this.projectMap[projectId].getDefinitionAtPosition(fileId, position);
        }
        
        public getTypeDefinitionAtPosition(projectId: string, fileId: string, position: number): ts.DefinitionInfo[] {
            return this.projectMap[projectId].getTypeDefinitionAtPosition(fileId, position);
        }
        
        public getReferencesAtPosition(projectId: string, fileId: string, position: number): ts.ReferenceEntry[] {
            return this.projectMap[projectId].getReferencesAtPosition(fileId,position);
        }
        
        public cleanupSemanticCache(projectId: string) {
            return this.projectMap[projectId].cleanupSemanticCache();
        }
        
        public getSyntacticDiagnostics(projectId: string, fileId: string) : DiagnosticEx[] {
            return this.projectMap[projectId].getSyntacticDiagnostics(fileId).map( function(v) {
                return new DiagnosticEx(v);
            } );
        }
        
        public getSemanticDiagnostics(projectId: string, fileId : string) : DiagnosticEx[] {
            return this.projectMap[projectId].getSemanticDiagnostics(fileId).map( function(v) {
                return new DiagnosticEx(v);
            } );
        }
        
        public getCompilerOptionsDiagnostics(projectId: string) : DiagnosticEx[] {
            return this.projectMap[projectId].getCompilerOptionsDiagnostics().map( function(v) {
                return new DiagnosticEx(v);
            } );
        }
        
        public getEncodedSyntacticClassifications(projectId: string, fileId : string, span : ts.TextSpan) : ts.Classifications {
            return this.projectMap[projectId].getEncodedSyntacticClassifications(fileId,span);
        }
        
        public getEncodedSemanticClassifications(projectId: string, fileId: string, span: ts.TextSpan) : ts.Classifications {
            return this.projectMap[projectId].getEncodedSemanticClassifications(fileId,span);
        }
        
        public findReferences(projectId: string, fileId: string, position: number) : ts.ReferencedSymbol[] {
            return this.projectMap[projectId].findReferences(fileId,position);
        }
        
        public getDocumentHighlights(projectId: string, fileId: string, position: number, filesToSearch: string[]) : ts.DocumentHighlights[] {
            return this.projectMap[projectId].getDocumentHighlights(fileId,position,filesToSearch);
        }
        
        public getOccurrencesAtPosition(projectId: string, fileId: string, position: number) : ts.ReferenceEntry[] {
            return this.projectMap[projectId].getOccurrencesAtPosition(fileId,position);
        }
        
        public getNavigateToItems(projectId: string, searchValue: string, maxResultCount?: number) : ts.NavigateToItem[] {
            return this.projectMap[projectId].getNavigateToItems(searchValue,maxResultCount);
        }
        
        public getTodoComments(projectId: string, fileId: string, descriptors: ts.TodoCommentDescriptor[]) : ts.TodoComment[] {
            return this.projectMap[projectId].getTodoComments(fileId,descriptors);
        }
        
        public getBraceMatchingAtPosition(projectId: string, fileId: string, position: number) : ts.TextSpan[] {
            return this.projectMap[projectId].getBraceMatchingAtPosition(fileId,position);
        }
        
        public getIndentationAtPosition(projectId: string, fileId: string, position: number, options: ts.EditorOptions) : number {
            return this.projectMap[projectId].getIndentationAtPosition(fileId,position,options);
        }
        
        public getFormattingEditsForRange(projectId: string, fileId: string, start: number, end: number, options: ts.FormatCodeOptions) : ts.TextChange[] {
            return this.projectMap[projectId].getFormattingEditsForRange(fileId,start,end,options);
        }
        
        public getFormattingEditsForDocument(projectId: string, fileId: string, options: ts.FormatCodeOptions) : ts.TextChange[] {
            return this.projectMap[projectId].getFormattingEditsForDocument(fileId,options);
        }
        
        public getFormattingEditsAfterKeystroke(projectId: string, fileId: string, position: number, key: string, options: ts.FormatCodeOptions) : ts.TextChange[] {
            return this.projectMap[projectId].getFormattingEditsAfterKeystroke(fileId,position,key,options);
        }
        
        public getDocCommentTemplateAtPosition(projectId: string, fileId: string, position: number) : ts.TextInsertion {
            return this.projectMap[projectId].getDocCommentTemplateAtPosition(fileId,position);
        }
        
        public getEmitOutput(projectId: string, fileId: string) : ts.EmitOutput {
            return this.projectMap[projectId].getEmitOutput(fileId);
        }
        
        public getProgram(projectId: string) {
            return this.projectMap[projectId].getProgram();
        }
        
        public getSourceFile(projectId: string, fileId: string) : ts.SourceFile {
            return this.projectMap[projectId].getSourceFile(fileId);
        }
        
        public dispose(projectId: string) {
            this.projectMap[projectId].dispose();
            this.projectMap[projectId] = null;
        }
        
        private 
	}
    
    class DiagnosticEx implements ts.Diagnostic {
        file: ts.SourceFile;
        start: number;
        length: number;
        messageText: string | ts.DiagnosticMessageChain;
        category: ts.DiagnosticCategory;
        code: number;
        message : DiagnosticMessage;
        
        constructor( original : ts.Diagnostic ) {
            this.file = original.file;
            this.start = original.start;
            this.length = original.length;
            this.category = original.category;
            this.code = original.code;
            this.message = new DiagnosticMessage();
            if( typeof original.messageText === "string" ) {
                this.message.messageText = original.messageText + "";
            } else {
                this.message.messageChain = <ts.DiagnosticMessageChain> original.messageText;
            }
        }
    }
    
    class DiagnosticMessage {
        public messageText : string;
        public messageChain : ts.DiagnosticMessageChain;
    }

	class Project implements ts.LanguageServiceHost {
		private id : string;
        private name : string;
        private documentRegistry : ts.DocumentRegistry;
		private service : ts.LanguageService;
		private compilerOptions: ts.CompilerOptions;
        // private fileFilter: (fileName: string) => boolean;
        private fileInfos: { [filePath: string]: ScriptFile } = {};
        private fileIdMap : { [fileId : string]: string } = {};
        private fileCount : number = 0;

		constructor(id : string, name : string ) {
            this.documentRegistry = ts.createDocumentRegistry();
			this.id = id;
            this.name = name;
            this.compilerOptions = ts.getDefaultCompilerOptions();
            this.service = ts.createLanguageService(this, this.documentRegistry);
		}

        public addFile(filePath : string) {
            console.log("Reading file '"+filePath+"' to project '"+this.id+"'");
            var content = readFileContents(filePath);
            var id = "f_" + (this.fileCount++);
            this.fileIdMap[id] = filePath;
            this.fileInfos[filePath] = new ScriptFile(content, filePath);
            console.log("The generated file id is '"+id+"'");
            return id;
        }
        
        public removeFile(fileId : string) {
            console.log("Removing file '"+filePath+"' from project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            delete this.fileIdMap[fileId];
            delete this.fileInfos[filePath];
            //TODO Need to release from registry this.documentRegistry.releaseDocument(filePath);
        }
        
        public initProject( compilerOptions : ts.CompilerOptions, fileList : string[] ) : string[] {
            console.log("Init project");
            this.compilerOptions = compilerOptions;
            
            var self = this;
            
            var lib = this.getDefaultLibFileName(this.compilerOptions);
            if( lib && lib != '' ) {
                self.addFile(lib);
            }
            
            if( fileList ) {
                return fileList.map( v => { return self.addFile(v) } );
            }
            
            return [];
        }
        
        public open(fileId : string) {
            var filePath = this.toRealFile(fileId);
            var content = readFileContents(filePath);
            this.updateContent(filePath, content);
        }
        
        public close(fileId : string) {
            var filePath = this.toRealFile(fileId);
            var content = readFileContents(filePath);
            this.updateContent(filePath, content);
        }
        
        public modifyContent(fileId : string, offset: number, length: number, text: string) {
            console.log("Modify file '"+fileId+"'");
            var filePath = this.toRealFile(fileId);
            var fi = this.fileInfos[filePath];
            if( fi ) {
                fi.editContents(offset,length,text);
            }
        }
        
        public updateContent(fileId : string, content : string) {
            var filePath = this.toRealFile(fileId);
            var fi = this.fileInfos[filePath];
            fi.updateFile( content );
        }

        public getNavigationBarItems(fileId : string) {
            console.log("Get navigation bar items for file with id '"+fileId+"' in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getNavigationBarItems(filePath);
        }
        
        public getCompletionsAtPosition(fileId: string, position: number) {
            console.log("Get completions for file with id '"+fileId+"' at position "+position+" in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getCompletionsAtPosition(filePath,position);
        }
        
        public getCompletionsAtPositionWithDetails(fileId: string, position: number) {
            console.log("Get completions with details for file with id '"+fileId+"' at position "+position+" in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            var info = this.service.getCompletionsAtPosition(filePath,position);
            var rv : CompletionInfoWithDetails;
            var detailEntryList : ts.CompletionEntryDetails[];
            if( info != null ) {
                detailEntryList = info.entries.filter( e => {
                    if( e.kind == ts.ScriptElementKind.keyword || e.kind == ts.ScriptElementKind.primitiveType ) {
                        return false;
                    }
                    return true;
                } ).map( e => {
                    return this.service.getCompletionEntryDetails(filePath,position,e.name);
                } ).filter( de => de != null );
            }
            
            rv = {
                    info : info,
                    details : detailEntryList
                };
            
            return rv;
        }
        
        public getCompletionEntryDetails(fileId: string, position: number, entryName : string) {
            console.log("Get completion details for '"+entryName+"' in file with id '"+fileId+"' at position "+position+" in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getCompletionEntryDetails(filePath,position,entryName);
        }
        
        public getOutliningSpans(fileId: string): ts.OutliningSpan[] {
            console.log("Get outline spans for file with id '"+fileId+"' in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getOutliningSpans(filePath);
        }
        
        public getQuickInfoAtPosition(fileId: string, position: number) {
            console.log("Get quick info positions for file with id '"+fileId+"' at position '"+position+"' in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getQuickInfoAtPosition(filePath,position);
        }
        
        public getNameOrDottedNameSpan(fileId: string, startPos: number, endPos: number) {
            console.log("Get quick info positions for file with id '"+fileId+"' at startPos '"+startPos+"' to endPos '"+endPos+"' in project '"+this.id+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getNameOrDottedNameSpan(fileId,startPos,endPos);
        }
        
        public getBreakpointStatementAtPosition(fileId: string, position: number) {
            console.log("Get breakpoint statement at for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getBreakpointStatementAtPosition(filePath,position);
        }
        
        public getSignatureHelpItems(fileId: string, position: number) {
            console.log("Get signature help items for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSignatureHelpItems(filePath,position);
        }
        
        public getRenameInfo(fileId: string, position: number) {
            console.log("Get signature help items for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getRenameInfo(filePath,position);
        }
        
        public findRenameLocations(fileId: string, position: number, findInStrings: boolean, findInComments: boolean) {
            console.log("Find rename location for file with id '"+fileId+"' at position '"+position+"', findInStrings '"+findInStrings+"', findInComments '"+findInComments+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.findRenameLocations(filePath,position,findInStrings,findInComments);
        }
        
        public getDefinitionAtPosition(fileId: string, position: number) {
            console.log("Find definition for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDefinitionAtPosition(filePath,position);
        }
        
        public getTypeDefinitionAtPosition(fileId: string, position: number) {
            console.log("Find type definition for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getTypeDefinitionAtPosition(filePath,position);
        }
        
        public getReferencesAtPosition(fileId: string, position: number) {
            console.log("Find references for file with id '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getReferencesAtPosition(filePath,position);
        }
        
        public cleanupSemanticCache() {
            console.log("Cleanup semantic cache");
            return this.service.cleanupSemanticCache();
        }
        
        public getSyntacticDiagnostics(fileId: string) {
            console.log("get syntactic diagnostics for file with id '"+fileId+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSyntacticDiagnostics(filePath);
        }
        
        public getSemanticDiagnostics(fileId : string) {
            console.log("get semantic diagnostics for file with id '"+fileId+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSemanticDiagnostics(filePath);
        }
        
        public getCompilerOptionsDiagnostics() {
            console.log("get compiler options diagnostics");
            return this.service.getCompilerOptionsDiagnostics();
        }
        
        public getEncodedSyntacticClassifications(fileId : string, span : ts.TextSpan) {
            console.log("get encoded syntactic classifications for file '"+fileId+"' and span '"+span+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEncodedSyntacticClassifications(filePath,span);
        }
        
        public getEncodedSemanticClassifications(fileId: string, span: ts.TextSpan) {
            console.log("get encoded semantic classifications for file '"+fileId+"' and span '"+span+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEncodedSemanticClassifications(filePath,span);
        }
        
        public findReferences(fileId: string, position: number) {
            console.log("find references for file '"+fileId+"' and position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.findReferences(filePath,position);
        }
        
        public getDocumentHighlights(fileId: string, position: number, filesToSearch: string[]) {
            console.log("get document highlights for file '"+fileId+"' at position '"+position+"' and files to search in '"+filesToSearch+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDocumentHighlights(filePath,position,filesToSearch);
        }
        
        public getOccurrencesAtPosition(fileId: string, position: number) {
            console.log("get occurrences at position for file '"+fileId+"' at position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getOccurrencesAtPosition(filePath,position);
        }
        
        public getNavigateToItems(searchValue: string, maxResultCount?: number) {
            console.log("get navigate to items for search value '"+searchValue+"' and max results '"+maxResultCount+"'");
            return this.service.getNavigateToItems(searchValue,maxResultCount);
        }
        
        public getTodoComments(fileId: string, descriptors: ts.TodoCommentDescriptor[]) {
            console.log("get todo comments for file '"+fileId+"' and descriptors '"+descriptors+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getTodoComments(fileId,descriptors);
        }
        
        public getBraceMatchingAtPosition(fileId: string, position: number) {
            console.log("get brace matching at position for file '"+fileId+"' and position '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getBraceMatchingAtPosition(filePath,position);
        }
        
        public getIndentationAtPosition(fileId: string, position: number, options: ts.EditorOptions) {
            console.log("get indentation at position for file '"+fileId+"' and position '"+position+"' with editor options '"+options+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getIndentationAtPosition(filePath,position,options);
        }
        
        public getFormattingEditsForRange(fileId: string, start: number, end: number, options: ts.FormatCodeOptions) {
            console.log("get format edits in range ("+start+" - "+end+") for file '"+fileId+"' with options '"+options+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsForRange(filePath,start,end,options);
        }
        
        public getFormattingEditsForDocument(fileId: string, options: ts.FormatCodeOptions) {
            console.log("get formatting edits for file '"+fileId+"' and options '"+options+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsForDocument(filePath,options);
        }
        
        public getFormattingEditsAfterKeystroke(fileId: string, position: number, key: string, options: ts.FormatCodeOptions) {
            console.log("get formatting edits after keystroke for file '"+fileId+"' at '"+position+"' key '"+key+"' with options '"+options+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsAfterKeystroke(fileId,position,key,options);
        }
        
        public getDocCommentTemplateAtPosition(fileId: string, position: number) {
            console.log("get doc comment template for file '"+fileId+"' at '"+position+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDocCommentTemplateAtPosition(filePath,position);
        }
        
        public getEmitOutput(fileId: string) {
            console.log("get emit output for '"+fileId+"'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEmitOutput(filePath);
        }
        
        public getProgram() {
            console.log("get program");
            return this.service.getProgram();
        }
        
        public getSourceFile(fileId: string) {
            console.log("get source file '"+fileId+"'" );
            var filePath = this.toRealFile(fileId);
            return this.service.getSourceFile(filePath);
        }
        
        public dispose() {
            console.log("dispose");
            this.fileIdMap = null;
            this.fileInfos = null;
            this.documentRegistry = null;
            this.dispose();
        }
                
        private toRealFile(fileId: string) {
            var filePath = this.fileIdMap[fileId];
            if( filePath == null && this.fileInfos[fileId] != null ) {
                filePath = fileId;
            }
            console.log("'"+fileId+"' is mapped to '"+filePath+"'");
            return filePath;
        }
        
        // -- cleanupSemanticCache(): void;
        // -- getSyntacticDiagnostics(fileName: string): Diagnostic[];
        // -- getSemanticDiagnostics(fileName: string): Diagnostic[];
        // -- getCompilerOptionsDiagnostics(): Diagnostic[];
        // -- getEncodedSyntacticClassifications(fileName: string, span: TextSpan): Classifications;
        // -- getEncodedSemanticClassifications(fileName: string, span: TextSpan): Classifications;
        // -- getCompletionsAtPosition(fileName: string, position: number): CompletionInfo;
        // -- getCompletionEntryDetails(fileName: string, position: number, entryName: string): CompletionEntryDetails;
        // -- getQuickInfoAtPosition(fileName: string, position: number): QuickInfo;
        // -- getNameOrDottedNameSpan(fileName: string, startPos: number, endPos: number): TextSpan;
        // -- getBreakpointStatementAtPosition(fileName: string, position: number): TextSpan;
        // -- getSignatureHelpItems(fileName: string, position: number): SignatureHelpItems;
        // -- getRenameInfo(fileName: string, position: number): RenameInfo;
        // -- findRenameLocations(fileName: string, position: number, findInStrings: boolean, findInComments: boolean): RenameLocation[];
        // -- getDefinitionAtPosition(fileName: string, position: number): DefinitionInfo[];
        // -- getTypeDefinitionAtPosition(fileName: string, position: number): DefinitionInfo[];
        // -- getReferencesAtPosition(fileName: string, position: number): ReferenceEntry[];
        // -- findReferences(fileName: string, position: number): ReferencedSymbol[];
        // -- getDocumentHighlights(fileName: string, position: number, filesToSearch: string[]): DocumentHighlights[];
        // -- getOccurrencesAtPosition(fileName: string, position: number): ReferenceEntry[];
        // -- getNavigateToItems(searchValue: string, maxResultCount?: number): NavigateToItem[];
        // -- getNavigationBarItems(fileName: string): NavigationBarItem[];
        // -- getOutliningSpans(fileName: string): OutliningSpan[];
        // -- getTodoComments(fileName: string, descriptors: TodoCommentDescriptor[]): TodoComment[];
        // -- getBraceMatchingAtPosition(fileName: string, position: number): TextSpan[];
        // -- getIndentationAtPosition(fileName: string, position: number, options: EditorOptions): number;
        // -- getFormattingEditsForRange(fileName: string, start: number, end: number, options: FormatCodeOptions): TextChange[];
        // -- getFormattingEditsForDocument(fileName: string, options: FormatCodeOptions): TextChange[];
        // -- getFormattingEditsAfterKeystroke(fileName: string, position: number, key: string, options: FormatCodeOptions): TextChange[];
        // -- getDocCommentTemplateAtPosition(fileName: string, position: number): TextInsertion;
        // -- getEmitOutput(fileName: string): EmitOutput;
        // -- getProgram(): Program;
        // -- getSourceFile(fileName: string): SourceFile;
        // -- dispose(): void;

		public getCompilationSettings() {
			return this.compilerOptions;
		}

//		public getNewLine() {
//			return EOL;
//		}

//		public getProjectVersion() {
//
//		}

		public getScriptFileNames() {
			return Object.getOwnPropertyNames(this.fileInfos);//.filter(this.fileFilter);
		}

		public getScriptVersion(fileName: string) {
			return this.fileInfos[fileName].getVersion();
		}

		public getScriptSnapshot(fileName: string) {
			var fileInfo = this.fileInfos[fileName];

            // return undefined if the file is not found to indicate it does not exist
            // for more info, please see https://github.com/Microsoft/TypeScript/commit/9628191a1476bc0dbdb28bfd30b840656ffc26a3
            if (fileInfo == null) {
                return undefined;
            }

            return fileInfo.getSnapshot();
		}

//		public getLocalizedDiagnosticMessages() {
//
//		}

//		public getCancellationToken() {
//
//		}

		public getCurrentDirectory() {
			return "";
		}

		public getDefaultLibFileName(options: ts.CompilerOptions) {
            console.log("=========> Loading default lib");
            if( ! options || options.noLib ) {
                console.log("noLib");
                return '';
            } else if( options.target === ts.ScriptTarget.ES6 ) {
                console.log("Default lib ES6");
                return "platform:/plugin/at.bestsolution.typescript.service.api/node/libs/lib.d.ts";
            } else {
                console.log("Default lib ES5");
                return "platform:/plugin/at.bestsolution.typescript.service.api/node/libs/lib.es6.d.ts";
            }
		}

//		public log(s : string) {
//
//		}

//		public trace(s: string) {
//
//		}

//		public error(s: string) {
//
//		}

//		public useCaseSensitiveFileNames() {
//
//		}

		//public resolveModuleNames(moduleNames: string[], containingFile: string) {
		//
		//}
	}
    
    interface CompletionInfoWithDetails {
        info : ts.CompletionInfo;
        details : ts.CompletionEntryDetails[];
    }

    class ScriptFile {

        private contents: string;
        private path: string;
        private version : number = 0;

        constructor(contents: string, path: string) {
            this.contents = contents;
            this.path = path;
        }

        public editContents(offset: number, length: number, text: string): void {
            var prefix = this.contents.substring(0, offset);
            var suffix = this.contents.substring(offset + length);
                        
            this.contents = prefix + text + suffix;
            this.version += 1;
        }
        
        public getSnapshot() : ts.IScriptSnapshot {
            var value = this.contents;
                var len = value.length;
            
                return {
                    getLength: () => len,
		            getText: value.substring.bind(value),
		            getChangeRange: () => null  
                 };
        }

        public getVersion() {
            return this.version.toString(10);
        }

        public updateFile(contents: string) {
            var span = ts.createTextSpan(0, this.contents.length);
            var change = ts.createTextChangeRange(span, contents.length);

            this.contents = contents;
            this.version +=1;
        }
    }
}