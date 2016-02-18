package at.bestsolution.typescript.service.api.pojo.model;

import at.bestsolution.typescript.service.api.model.*;

public class CompilerOptionsPojo  implements CompilerOptions {
	private boolean allowNonTsExtensions ;
	private String charset ;
	private boolean declaration ;
	private boolean diagnostics ;
	private boolean emitBOM ;
	private boolean help ;
	private boolean init ;
	private boolean inlineSourceMap ;
	private boolean inlineSources ;
	private boolean jsx ;
	private boolean listFiles ;
	private String locale ;
	private String mapRoot ;
	private boolean noEmit ;
	private boolean noEmitHelpers ;
	private boolean noEmitOnError ;
	private boolean noErrorTruncation ;
	private boolean noImplicitAny ;
	private boolean noLib ;
	private boolean noResolve ;
	private String out ;
	private String outFile ;
	private String outDir ;
	private boolean preserveConstEnums ;
	private String project ;
	private boolean removeComments ;
	private String rootDir ;
	private boolean sourceMap ;
	private String sourceRoot ;
	private boolean suppressExcessPropertyErrors ;
	private boolean suppressImplicitAnyIndexErrors ;
		private int target  = 0;
	private at.bestsolution.typescript.service.api.model.ScriptTarget _target = null;
	private boolean version ;
	private boolean watch ;
	private boolean isolatedModules ;
	private boolean experimentalDecorators ;
	private boolean emitDecoratorMetadata ;

	public CompilerOptionsPojo() {
	}

	public boolean allowNonTsExtensions() {
		return this.allowNonTsExtensions;
	}
	public String charset() {
		return this.charset;
	}
	public boolean declaration() {
		return this.declaration;
	}
	public boolean diagnostics() {
		return this.diagnostics;
	}
	public boolean emitBOM() {
		return this.emitBOM;
	}
	public boolean help() {
		return this.help;
	}
	public boolean init() {
		return this.init;
	}
	public boolean inlineSourceMap() {
		return this.inlineSourceMap;
	}
	public boolean inlineSources() {
		return this.inlineSources;
	}
	public boolean jsx() {
		return this.jsx;
	}
	public boolean listFiles() {
		return this.listFiles;
	}
	public String locale() {
		return this.locale;
	}
	public String mapRoot() {
		return this.mapRoot;
	}
	public boolean noEmit() {
		return this.noEmit;
	}
	public boolean noEmitHelpers() {
		return this.noEmitHelpers;
	}
	public boolean noEmitOnError() {
		return this.noEmitOnError;
	}
	public boolean noErrorTruncation() {
		return this.noErrorTruncation;
	}
	public boolean noImplicitAny() {
		return this.noImplicitAny;
	}
	public boolean noLib() {
		return this.noLib;
	}
	public boolean noResolve() {
		return this.noResolve;
	}
	public String out() {
		return this.out;
	}
	public String outFile() {
		return this.outFile;
	}
	public String outDir() {
		return this.outDir;
	}
	public boolean preserveConstEnums() {
		return this.preserveConstEnums;
	}
	public String project() {
		return this.project;
	}
	public boolean removeComments() {
		return this.removeComments;
	}
	public String rootDir() {
		return this.rootDir;
	}
	public boolean sourceMap() {
		return this.sourceMap;
	}
	public String sourceRoot() {
		return this.sourceRoot;
	}
	public boolean suppressExcessPropertyErrors() {
		return this.suppressExcessPropertyErrors;
	}
	public boolean suppressImplicitAnyIndexErrors() {
		return this.suppressImplicitAnyIndexErrors;
	}
	public ScriptTarget target() {
		if( _target != null ) return _target;
		return _target = at.bestsolution.typescript.service.api.model.ScriptTarget.fromValue(this.target);
	}
	public boolean version() {
		return this.version;
	}
	public boolean watch() {
		return this.watch;
	}
	public boolean isolatedModules() {
		return this.isolatedModules;
	}
	public boolean experimentalDecorators() {
		return this.experimentalDecorators;
	}
	public boolean emitDecoratorMetadata() {
		return this.emitDecoratorMetadata;
	}
	public static Builder create(boolean allowNonTsExtensions) {
		return new BuilderImpl(new CompilerOptionsPojo(), allowNonTsExtensions);
	}

	public static class BuilderImpl implements Builder {
		private final CompilerOptionsPojo pojo;

		BuilderImpl(CompilerOptionsPojo pojo, boolean allowNonTsExtensions) {
			this.pojo = pojo;
			this.pojo.allowNonTsExtensions = (boolean)allowNonTsExtensions;
		}

		public Builder charset( String charset ) {
			this.pojo.charset = (String)charset;
			return this;
		}
		public Builder declaration( boolean declaration ) {
			this.pojo.declaration = (boolean)declaration;
			return this;
		}
		public Builder diagnostics( boolean diagnostics ) {
			this.pojo.diagnostics = (boolean)diagnostics;
			return this;
		}
		public Builder emitBOM( boolean emitBOM ) {
			this.pojo.emitBOM = (boolean)emitBOM;
			return this;
		}
		public Builder help( boolean help ) {
			this.pojo.help = (boolean)help;
			return this;
		}
		public Builder init( boolean init ) {
			this.pojo.init = (boolean)init;
			return this;
		}
		public Builder inlineSourceMap( boolean inlineSourceMap ) {
			this.pojo.inlineSourceMap = (boolean)inlineSourceMap;
			return this;
		}
		public Builder inlineSources( boolean inlineSources ) {
			this.pojo.inlineSources = (boolean)inlineSources;
			return this;
		}
		public Builder jsx( boolean jsx ) {
			this.pojo.jsx = (boolean)jsx;
			return this;
		}
		public Builder listFiles( boolean listFiles ) {
			this.pojo.listFiles = (boolean)listFiles;
			return this;
		}
		public Builder locale( String locale ) {
			this.pojo.locale = (String)locale;
			return this;
		}
		public Builder mapRoot( String mapRoot ) {
			this.pojo.mapRoot = (String)mapRoot;
			return this;
		}
		public Builder noEmit( boolean noEmit ) {
			this.pojo.noEmit = (boolean)noEmit;
			return this;
		}
		public Builder noEmitHelpers( boolean noEmitHelpers ) {
			this.pojo.noEmitHelpers = (boolean)noEmitHelpers;
			return this;
		}
		public Builder noEmitOnError( boolean noEmitOnError ) {
			this.pojo.noEmitOnError = (boolean)noEmitOnError;
			return this;
		}
		public Builder noErrorTruncation( boolean noErrorTruncation ) {
			this.pojo.noErrorTruncation = (boolean)noErrorTruncation;
			return this;
		}
		public Builder noImplicitAny( boolean noImplicitAny ) {
			this.pojo.noImplicitAny = (boolean)noImplicitAny;
			return this;
		}
		public Builder noLib( boolean noLib ) {
			this.pojo.noLib = (boolean)noLib;
			return this;
		}
		public Builder noResolve( boolean noResolve ) {
			this.pojo.noResolve = (boolean)noResolve;
			return this;
		}
		public Builder out( String out ) {
			this.pojo.out = (String)out;
			return this;
		}
		public Builder outFile( String outFile ) {
			this.pojo.outFile = (String)outFile;
			return this;
		}
		public Builder outDir( String outDir ) {
			this.pojo.outDir = (String)outDir;
			return this;
		}
		public Builder preserveConstEnums( boolean preserveConstEnums ) {
			this.pojo.preserveConstEnums = (boolean)preserveConstEnums;
			return this;
		}
		public Builder project( String project ) {
			this.pojo.project = (String)project;
			return this;
		}
		public Builder removeComments( boolean removeComments ) {
			this.pojo.removeComments = (boolean)removeComments;
			return this;
		}
		public Builder rootDir( String rootDir ) {
			this.pojo.rootDir = (String)rootDir;
			return this;
		}
		public Builder sourceMap( boolean sourceMap ) {
			this.pojo.sourceMap = (boolean)sourceMap;
			return this;
		}
		public Builder sourceRoot( String sourceRoot ) {
			this.pojo.sourceRoot = (String)sourceRoot;
			return this;
		}
		public Builder suppressExcessPropertyErrors( boolean suppressExcessPropertyErrors ) {
			this.pojo.suppressExcessPropertyErrors = (boolean)suppressExcessPropertyErrors;
			return this;
		}
		public Builder suppressImplicitAnyIndexErrors( boolean suppressImplicitAnyIndexErrors ) {
			this.pojo.suppressImplicitAnyIndexErrors = (boolean)suppressImplicitAnyIndexErrors;
			return this;
		}
		public Builder target( ScriptTarget target ) {
			this.pojo._target = target;
			this.pojo.target = target.asValue();
			return this;
		}
		public Builder version( boolean version ) {
			this.pojo.version = (boolean)version;
			return this;
		}
		public Builder watch( boolean watch ) {
			this.pojo.watch = (boolean)watch;
			return this;
		}
		public Builder isolatedModules( boolean isolatedModules ) {
			this.pojo.isolatedModules = (boolean)isolatedModules;
			return this;
		}
		public Builder experimentalDecorators( boolean experimentalDecorators ) {
			this.pojo.experimentalDecorators = (boolean)experimentalDecorators;
			return this;
		}
		public Builder emitDecoratorMetadata( boolean emitDecoratorMetadata ) {
			this.pojo.emitDecoratorMetadata = (boolean)emitDecoratorMetadata;
			return this;
		}

		public CompilerOptions build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "CompilerOptions@"+hashCode()+"[allowNonTsExtensions = "+allowNonTsExtensions()+", charset = "+charset()+", declaration = "+declaration()+", diagnostics = "+diagnostics()+", emitBOM = "+emitBOM()+", help = "+help()+", init = "+init()+", inlineSourceMap = "+inlineSourceMap()+", inlineSources = "+inlineSources()+", jsx = "+jsx()+", listFiles = "+listFiles()+", locale = "+locale()+", mapRoot = "+mapRoot()+", noEmit = "+noEmit()+", noEmitHelpers = "+noEmitHelpers()+", noEmitOnError = "+noEmitOnError()+", noErrorTruncation = "+noErrorTruncation()+", noImplicitAny = "+noImplicitAny()+", noLib = "+noLib()+", noResolve = "+noResolve()+", out = "+out()+", outFile = "+outFile()+", outDir = "+outDir()+", preserveConstEnums = "+preserveConstEnums()+", project = "+project()+", removeComments = "+removeComments()+", rootDir = "+rootDir()+", sourceMap = "+sourceMap()+", sourceRoot = "+sourceRoot()+", suppressExcessPropertyErrors = "+suppressExcessPropertyErrors()+", suppressImplicitAnyIndexErrors = "+suppressImplicitAnyIndexErrors()+", target = "+target()+", version = "+version()+", watch = "+watch()+", isolatedModules = "+isolatedModules()+", experimentalDecorators = "+experimentalDecorators()+", emitDecoratorMetadata = "+emitDecoratorMetadata()+"]";
	}
}
