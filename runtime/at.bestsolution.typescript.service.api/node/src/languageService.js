/// <reference path="../typings/typeScriptServices.d.ts" />
function readFileContents(fileName) {
    var fs = require("fs");
    var options = { encoding: "utf8" };
    return fs.readFileSync(fileName, options);
}
var TypeScriptServiceAPI;
(function (TypeScriptServiceAPI) {
    // const EOL = require("os").EOL;
    var ServiceDispatcher = (function () {
        function ServiceDispatcher() {
            this.services = Object.create;
            this.services["LanguageService"] = new LanguageServiceWrapper();
        }
        ServiceDispatcher.prototype.invokeMethod = function (request) {
            var rpc = JSON.parse(request);
            var requestId = rpc.requestId;
            var serviceInstance = this.services[rpc.service];
            var methodHandle = serviceInstance[rpc.method];
            var rv = methodHandle.apply(serviceInstance, rpc.parameters);
            return JSON.stringify(new Response(requestId, rv));
        };
        return ServiceDispatcher;
    }());
    TypeScriptServiceAPI.ServiceDispatcher = ServiceDispatcher;
    var Response = (function () {
        function Response(requestIdRef, result) {
            this.requestIdRef = requestIdRef;
            if (result == undefined) {
                this.result = null;
            }
            else if (result.constructor === Array) {
                this.result = result;
            }
            else {
                this.result = result;
            }
        }
        return Response;
    }());
    TypeScriptServiceAPI.Response = Response;
    var LanguageServiceWrapper = (function () {
        function LanguageServiceWrapper() {
            this.projectCounter = 0;
            this.projectMap = {};
            console.log("Createing Language Service Wrapper");
        }
        LanguageServiceWrapper.prototype.createProject = function (name, compilationSettings) {
            console.log("Createing new project '" + name + "'");
            var id = "p_" + (this.projectCounter++);
            compilationSettings = ts.getDefaultCompilerOptions();
            /*compilationSettings.emitDecoratorMetadata = true;
            compilationSettings.noImplicitAny = true;
            compilationSettings.experimentalDecorators = true;
            compilationSettings.declaration = true;*/
            this.projectMap[id] = new Project(id, name, compilationSettings);
            return id;
        };
        LanguageServiceWrapper.prototype.addFile = function (projectId, filePath) {
            return this.projectMap[projectId].addFile(filePath);
        };
        LanguageServiceWrapper.prototype.modifyContent = function (projectId, fileId, offset, length, text) {
            return this.projectMap[projectId].modifyContent(fileId, offset, length, text);
        };
        LanguageServiceWrapper.prototype.getNavigationBarItems = function (projectId, fileId) {
            return this.projectMap[projectId].getNavigationBarItems(fileId);
        };
        LanguageServiceWrapper.prototype.getCompletionsAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getCompletionsAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getCompletionsAtPositionWithDetails = function (projectId, fileId, position) {
            return this.projectMap[projectId].getCompletionsAtPositionWithDetails(fileId, position);
        };
        LanguageServiceWrapper.prototype.getCompletionEntryDetails = function (projectId, fileId, position, entryName) {
            return this.projectMap[projectId].getCompletionEntryDetails(fileId, position, entryName);
        };
        LanguageServiceWrapper.prototype.getOutliningSpans = function (projectId, fileId) {
            return this.projectMap[projectId].getOutliningSpans(fileId);
        };
        LanguageServiceWrapper.prototype.getQuickInfoAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getQuickInfoAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getNameOrDottedNameSpan = function (projectId, fileId, startPos, endPos) {
            return this.projectMap[projectId].getNameOrDottedNameSpan(fileId, startPos, endPos);
        };
        LanguageServiceWrapper.prototype.getBreakpointStatementAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getBreakpointStatementAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getSignatureHelpItems = function (projectId, fileId, position) {
            return this.projectMap[projectId].getSignatureHelpItems(fileId, position);
        };
        LanguageServiceWrapper.prototype.getRenameInfo = function (projectId, fileId, position) {
            return this.projectMap[projectId].getRenameInfo(fileId, position);
        };
        LanguageServiceWrapper.prototype.findRenameLocations = function (projectId, fileId, position, findInStrings, findInComments) {
            return this.projectMap[projectId].findRenameLocations(fileId, position, findInStrings, findInComments);
        };
        LanguageServiceWrapper.prototype.getDefinitionAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getDefinitionAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getTypeDefinitionAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getTypeDefinitionAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getReferencesAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getReferencesAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.cleanupSemanticCache = function (projectId) {
            return this.projectMap[projectId].cleanupSemanticCache();
        };
        LanguageServiceWrapper.prototype.getSyntacticDiagnostics = function (projectId, fileId) {
            return this.projectMap[projectId].getSyntacticDiagnostics(fileId).map(function (v) {
                return new DiagnosticEx(v);
            });
        };
        LanguageServiceWrapper.prototype.getSemanticDiagnostics = function (projectId, fileId) {
            return this.projectMap[projectId].getSemanticDiagnostics(fileId).map(function (v) {
                return new DiagnosticEx(v);
            });
        };
        LanguageServiceWrapper.prototype.getCompilerOptionsDiagnostics = function (projectId) {
            return this.projectMap[projectId].getCompilerOptionsDiagnostics().map(function (v) {
                return new DiagnosticEx(v);
            });
        };
        LanguageServiceWrapper.prototype.getEncodedSyntacticClassifications = function (projectId, fileId, span) {
            return this.projectMap[projectId].getEncodedSyntacticClassifications(fileId, span);
        };
        LanguageServiceWrapper.prototype.getEncodedSemanticClassifications = function (projectId, fileId, span) {
            return this.projectMap[projectId].getEncodedSemanticClassifications(fileId, span);
        };
        LanguageServiceWrapper.prototype.findReferences = function (projectId, fileId, position) {
            return this.projectMap[projectId].findReferences(fileId, position);
        };
        LanguageServiceWrapper.prototype.getDocumentHighlights = function (projectId, fileId, position, filesToSearch) {
            return this.projectMap[projectId].getDocumentHighlights(fileId, position, filesToSearch);
        };
        LanguageServiceWrapper.prototype.getOccurrencesAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getOccurrencesAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getNavigateToItems = function (projectId, searchValue, maxResultCount) {
            return this.projectMap[projectId].getNavigateToItems(searchValue, maxResultCount);
        };
        LanguageServiceWrapper.prototype.getTodoComments = function (projectId, fileId, descriptors) {
            return this.projectMap[projectId].getTodoComments(fileId, descriptors);
        };
        LanguageServiceWrapper.prototype.getBraceMatchingAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getBraceMatchingAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getIndentationAtPosition = function (projectId, fileId, position, options) {
            return this.projectMap[projectId].getIndentationAtPosition(fileId, position, options);
        };
        LanguageServiceWrapper.prototype.getFormattingEditsForRange = function (projectId, fileId, start, end, options) {
            return this.projectMap[projectId].getFormattingEditsForRange(fileId, start, end, options);
        };
        LanguageServiceWrapper.prototype.getFormattingEditsForDocument = function (projectId, fileId, options) {
            return this.projectMap[projectId].getFormattingEditsForDocument(fileId, options);
        };
        LanguageServiceWrapper.prototype.getFormattingEditsAfterKeystroke = function (projectId, fileId, position, key, options) {
            return this.projectMap[projectId].getFormattingEditsAfterKeystroke(fileId, position, key, options);
        };
        LanguageServiceWrapper.prototype.getDocCommentTemplateAtPosition = function (projectId, fileId, position) {
            return this.projectMap[projectId].getDocCommentTemplateAtPosition(fileId, position);
        };
        LanguageServiceWrapper.prototype.getEmitOutput = function (projectId, fileId) {
            return this.projectMap[projectId].getEmitOutput(fileId);
        };
        LanguageServiceWrapper.prototype.getProgram = function (projectId) {
            return this.projectMap[projectId].getProgram();
        };
        LanguageServiceWrapper.prototype.getSourceFile = function (projectId, fileId) {
            return this.projectMap[projectId].getSourceFile(fileId);
        };
        LanguageServiceWrapper.prototype.dispose = function (projectId) {
            this.projectMap[projectId].dispose();
            this.projectMap[projectId] = null;
        };
        return LanguageServiceWrapper;
    }());
    TypeScriptServiceAPI.LanguageServiceWrapper = LanguageServiceWrapper;
    var DiagnosticEx = (function () {
        function DiagnosticEx(original) {
            this.file = original.file;
            this.start = original.start;
            this.length = original.length;
            this.category = original.category;
            this.code = original.code;
            this.message = new DiagnosticMessage();
            if (typeof original.messageText === "string") {
                this.message.messageText = original.messageText + "";
            }
            else {
                this.message.messageChain = original.messageText;
            }
        }
        return DiagnosticEx;
    }());
    var DiagnosticMessage = (function () {
        function DiagnosticMessage() {
        }
        return DiagnosticMessage;
    }());
    var Project = (function () {
        function Project(id, name, compilerOptions) {
            // private fileFilter: (fileName: string) => boolean;
            this.fileInfos = {};
            this.fileIdMap = {};
            this.fileCount = 0;
            this.documentRegistry = ts.createDocumentRegistry();
            this.id = id;
            this.name = name;
            this.compilerOptions = compilerOptions;
            this.service = ts.createLanguageService(this, this.documentRegistry);
        }
        Project.prototype.addFile = function (filePath) {
            console.log("Reading file '" + filePath + "' to project '" + this.id + "'");
            var content = readFileContents(filePath);
            var id = "f_" + (this.fileCount++);
            this.fileIdMap[id] = filePath;
            this.fileInfos[filePath] = new FileInfo(content, filePath);
            console.log("The generated file id is '" + id + "'");
            return id;
        };
        Project.prototype.modifyContent = function (fileId, offset, length, text) {
            console.log("Modify file '" + fileId + "'");
            var filePath = this.toRealFile(fileId);
            var fi = this.fileInfos[filePath];
            if (fi) {
                fi.editContents(offset, length, text);
            }
        };
        Project.prototype.getNavigationBarItems = function (fileId) {
            console.log("Get navigation bar items for file with id '" + fileId + "' in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getNavigationBarItems(filePath);
        };
        Project.prototype.getCompletionsAtPosition = function (fileId, position) {
            console.log("Get completions for file with id '" + fileId + "' at position " + position + " in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getCompletionsAtPosition(filePath, position);
        };
        Project.prototype.getCompletionsAtPositionWithDetails = function (fileId, position) {
            var _this = this;
            console.log("Get completions with details for file with id '" + fileId + "' at position " + position + " in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            var info = this.service.getCompletionsAtPosition(filePath, position);
            var rv;
            var detailEntryList;
            if (info != null) {
                detailEntryList = info.entries.filter(function (e) {
                    if (e.kind == ts.ScriptElementKind.keyword || e.kind == ts.ScriptElementKind.primitiveType) {
                        return false;
                    }
                    return true;
                }).map(function (e) {
                    return _this.service.getCompletionEntryDetails(filePath, position, e.name);
                }).filter(function (de) { return de != null; });
            }
            rv = {
                info: info,
                details: detailEntryList
            };
            return rv;
        };
        Project.prototype.getCompletionEntryDetails = function (fileId, position, entryName) {
            console.log("Get completion details for '" + entryName + "' in file with id '" + fileId + "' at position " + position + " in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getCompletionEntryDetails(filePath, position, entryName);
        };
        Project.prototype.getOutliningSpans = function (fileId) {
            console.log("Get outline spans for file with id '" + fileId + "' in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getOutliningSpans(filePath);
        };
        Project.prototype.getQuickInfoAtPosition = function (fileId, position) {
            console.log("Get quick info positions for file with id '" + fileId + "' at position '" + position + "' in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getQuickInfoAtPosition(filePath, position);
        };
        Project.prototype.getNameOrDottedNameSpan = function (fileId, startPos, endPos) {
            console.log("Get quick info positions for file with id '" + fileId + "' at startPos '" + startPos + "' to endPos '" + endPos + "' in project '" + this.id + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getNameOrDottedNameSpan(fileId, startPos, endPos);
        };
        Project.prototype.getBreakpointStatementAtPosition = function (fileId, position) {
            console.log("Get breakpoint statement at for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getBreakpointStatementAtPosition(filePath, position);
        };
        Project.prototype.getSignatureHelpItems = function (fileId, position) {
            console.log("Get signature help items for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSignatureHelpItems(filePath, position);
        };
        Project.prototype.getRenameInfo = function (fileId, position) {
            console.log("Get signature help items for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getRenameInfo(filePath, position);
        };
        Project.prototype.findRenameLocations = function (fileId, position, findInStrings, findInComments) {
            console.log("Find rename location for file with id '" + fileId + "' at position '" + position + "', findInStrings '" + findInStrings + "', findInComments '" + findInComments + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.findRenameLocations(filePath, position, findInStrings, findInComments);
        };
        Project.prototype.getDefinitionAtPosition = function (fileId, position) {
            console.log("Find definition for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDefinitionAtPosition(filePath, position);
        };
        Project.prototype.getTypeDefinitionAtPosition = function (fileId, position) {
            console.log("Find type definition for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getTypeDefinitionAtPosition(filePath, position);
        };
        Project.prototype.getReferencesAtPosition = function (fileId, position) {
            console.log("Find references for file with id '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getReferencesAtPosition(filePath, position);
        };
        Project.prototype.cleanupSemanticCache = function () {
            console.log("Cleanup semantic cache");
            return this.service.cleanupSemanticCache();
        };
        Project.prototype.getSyntacticDiagnostics = function (fileId) {
            console.log("get syntactic diagnostics for file with id '" + fileId + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSyntacticDiagnostics(filePath);
        };
        Project.prototype.getSemanticDiagnostics = function (fileId) {
            console.log("get semantic diagnostics for file with id '" + fileId + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSemanticDiagnostics(filePath);
        };
        Project.prototype.getCompilerOptionsDiagnostics = function () {
            console.log("get compiler options diagnostics");
            return this.service.getCompilerOptionsDiagnostics();
        };
        Project.prototype.getEncodedSyntacticClassifications = function (fileId, span) {
            console.log("get encoded syntactic classifications for file '" + fileId + "' and span '" + span + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEncodedSyntacticClassifications(filePath, span);
        };
        Project.prototype.getEncodedSemanticClassifications = function (fileId, span) {
            console.log("get encoded semantic classifications for file '" + fileId + "' and span '" + span + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEncodedSemanticClassifications(filePath, span);
        };
        Project.prototype.findReferences = function (fileId, position) {
            console.log("find references for file '" + fileId + "' and position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.findReferences(filePath, position);
        };
        Project.prototype.getDocumentHighlights = function (fileId, position, filesToSearch) {
            console.log("get document highlights for file '" + fileId + "' at position '" + position + "' and files to search in '" + filesToSearch + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDocumentHighlights(filePath, position, filesToSearch);
        };
        Project.prototype.getOccurrencesAtPosition = function (fileId, position) {
            console.log("get occurrences at position for file '" + fileId + "' at position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getOccurrencesAtPosition(filePath, position);
        };
        Project.prototype.getNavigateToItems = function (searchValue, maxResultCount) {
            console.log("get navigate to items for search value '" + searchValue + "' and max results '" + maxResultCount + "'");
            return this.service.getNavigateToItems(searchValue, maxResultCount);
        };
        Project.prototype.getTodoComments = function (fileId, descriptors) {
            console.log("get todo comments for file '" + fileId + "' and descriptors '" + descriptors + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getTodoComments(fileId, descriptors);
        };
        Project.prototype.getBraceMatchingAtPosition = function (fileId, position) {
            console.log("get brace matching at position for file '" + fileId + "' and position '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getBraceMatchingAtPosition(filePath, position);
        };
        Project.prototype.getIndentationAtPosition = function (fileId, position, options) {
            console.log("get indentation at position for file '" + fileId + "' and position '" + position + "' with editor options '" + options + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getIndentationAtPosition(filePath, position, options);
        };
        Project.prototype.getFormattingEditsForRange = function (fileId, start, end, options) {
            console.log("get format edits in range (" + start + " - " + end + ") for file '" + fileId + "' with options '" + options + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsForRange(filePath, start, end, options);
        };
        Project.prototype.getFormattingEditsForDocument = function (fileId, options) {
            console.log("get formatting edits for file '" + fileId + "' and options '" + options + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsForDocument(filePath, options);
        };
        Project.prototype.getFormattingEditsAfterKeystroke = function (fileId, position, key, options) {
            console.log("get formatting edits after keystroke for file '" + fileId + "' at '" + position + "' key '" + key + "' with options '" + options + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getFormattingEditsAfterKeystroke(fileId, position, key, options);
        };
        Project.prototype.getDocCommentTemplateAtPosition = function (fileId, position) {
            console.log("get doc comment template for file '" + fileId + "' at '" + position + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getDocCommentTemplateAtPosition(filePath, position);
        };
        Project.prototype.getEmitOutput = function (fileId) {
            console.log("get emit output for '" + fileId + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getEmitOutput(filePath);
        };
        Project.prototype.getProgram = function () {
            console.log("get program");
            return this.service.getProgram();
        };
        Project.prototype.getSourceFile = function (fileId) {
            console.log("get source file '" + fileId + "'");
            var filePath = this.toRealFile(fileId);
            return this.service.getSourceFile(filePath);
        };
        Project.prototype.dispose = function () {
            console.log("dispose");
            this.fileIdMap = null;
            this.fileInfos = null;
            this.documentRegistry = null;
            this.dispose();
        };
        Project.prototype.toRealFile = function (fileId) {
            var filePath = this.fileIdMap[fileId];
            if (filePath == null && this.fileInfos[fileId] != null) {
                filePath = fileId;
            }
            console.log("'" + fileId + "' is mapped to '" + filePath + "'");
            return filePath;
        };
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
        Project.prototype.getCompilationSettings = function () {
            return this.compilerOptions;
        };
        //		public getNewLine() {
        //			return EOL;
        //		}
        //		public getProjectVersion() {
        //
        //		}
        Project.prototype.getScriptFileNames = function () {
            return Object.getOwnPropertyNames(this.fileInfos); //.filter(this.fileFilter);
        };
        Project.prototype.getScriptVersion = function (fileName) {
            return this.fileInfos[fileName].getVersion();
        };
        Project.prototype.getScriptSnapshot = function (fileName) {
            var fileInfo = this.fileInfos[fileName];
            // return undefined if the file is not found to indicate it does not exist
            // for more info, please see https://github.com/Microsoft/TypeScript/commit/9628191a1476bc0dbdb28bfd30b840656ffc26a3
            if (fileInfo == null) {
                return undefined;
            }
            return fileInfo.getSnapshot();
        };
        //		public getLocalizedDiagnosticMessages() {
        //
        //		}
        //		public getCancellationToken() {
        //
        //		}
        Project.prototype.getCurrentDirectory = function () {
            return "";
        };
        Project.prototype.getDefaultLibFileName = function (options) {
            return ts.getDefaultLibFileName(options);
        };
        return Project;
    }());
    // Taken from 
    // https://github.com/palantir/eclipse-typescript
    var FileInfo = (function () {
        function FileInfo(contents, path) {
            this.changes = [];
            this.contents = contents;
            this.open = false;
            this.path = path;
            console.log("CONTENTS: " + this.contents.length);
        }
        FileInfo.prototype.editContents = function (offset, length, text) {
            var prefix = this.contents.substring(0, offset);
            var suffix = this.contents.substring(offset + length);
            var newContents = prefix + text + suffix;
            var span = ts.createTextSpan(offset, length);
            var change = ts.createTextChangeRange(span, text.length);
            console.log("OLD content: " + this.contents.length);
            this.contents = newContents;
            this.changes.push(change);
            console.log("New content: " + this.contents.length);
            // console.log("OLD: " + oldText.length);
            console.log(JSON.stringify(change));
        };
        FileInfo.prototype.getOpen = function () {
            return this.open;
        };
        FileInfo.prototype.setOpen = function (open) {
            this.open = open;
        };
        FileInfo.prototype.getPath = function () {
            return this.path;
        };
        FileInfo.prototype.getSnapshot = function () {
            return new ScriptSnapshot(this.changes.slice(0), this.contents, this.changes.length);
        };
        FileInfo.prototype.getVersion = function () {
            return this.changes.length.toString(10);
        };
        FileInfo.prototype.updateFile = function (contents) {
            var span = ts.createTextSpan(0, this.contents.length);
            var change = ts.createTextChangeRange(span, contents.length);
            this.contents = contents;
            this.changes.push(change);
        };
        return FileInfo;
    }());
    // Taken from 
    // https://github.com/palantir/eclipse-typescript
    var ScriptSnapshot = (function () {
        function ScriptSnapshot(changes, contents, version) {
            this.changes = changes;
            this.contents = contents;
            this.version = version;
        }
        ScriptSnapshot.prototype.getText = function (start, end) {
            console.log("Text: " + start + " - " + end);
            console.log("Text: " + this.contents);
            return this.contents.substring(start, end);
        };
        ScriptSnapshot.prototype.getLength = function () {
            return this.contents.length;
        };
        ScriptSnapshot.prototype.getChangeRange = function (oldSnapshot) {
            console.log("Requesting change");
            var oldSnapshot2 = oldSnapshot;
            if (this.version === oldSnapshot2.version) {
                return ts.unchangedTextChangeRange;
            }
            else if (this.version - oldSnapshot2.version <= this.changes.length) {
                var start = this.changes.length - (this.version - oldSnapshot2.version);
                var changes = this.changes.slice(start);
                console.log(JSON.stringify(changes));
                var rv = ts.collapseTextChangeRangesAcrossMultipleVersions(changes);
                console.log(JSON.stringify(rv));
                return rv;
            }
            else {
                return null;
            }
        };
        return ScriptSnapshot;
    }());
})(TypeScriptServiceAPI || (TypeScriptServiceAPI = {}));
