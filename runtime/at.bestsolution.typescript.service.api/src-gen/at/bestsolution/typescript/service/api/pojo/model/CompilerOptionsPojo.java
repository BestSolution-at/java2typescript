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

		public Builder charset( String value ) {
			this.pojo.charset = (String)value;
			return this;
		}
		public Builder declaration( boolean value ) {
			this.pojo.declaration = (boolean)value;
			return this;
		}
		public Builder diagnostics( boolean value ) {
			this.pojo.diagnostics = (boolean)value;
			return this;
		}
		public Builder emitBOM( boolean value ) {
			this.pojo.emitBOM = (boolean)value;
			return this;
		}
		public Builder help( boolean value ) {
			this.pojo.help = (boolean)value;
			return this;
		}
		public Builder init( boolean value ) {
			this.pojo.init = (boolean)value;
			return this;
		}
		public Builder inlineSourceMap( boolean value ) {
			this.pojo.inlineSourceMap = (boolean)value;
			return this;
		}
		public Builder inlineSources( boolean value ) {
			this.pojo.inlineSources = (boolean)value;
			return this;
		}
		public Builder jsx( boolean value ) {
			this.pojo.jsx = (boolean)value;
			return this;
		}
		public Builder listFiles( boolean value ) {
			this.pojo.listFiles = (boolean)value;
			return this;
		}
		public Builder locale( String value ) {
			this.pojo.locale = (String)value;
			return this;
		}
		public Builder mapRoot( String value ) {
			this.pojo.mapRoot = (String)value;
			return this;
		}
		public Builder noEmit( boolean value ) {
			this.pojo.noEmit = (boolean)value;
			return this;
		}
		public Builder noEmitHelpers( boolean value ) {
			this.pojo.noEmitHelpers = (boolean)value;
			return this;
		}
		public Builder noEmitOnError( boolean value ) {
			this.pojo.noEmitOnError = (boolean)value;
			return this;
		}
		public Builder noErrorTruncation( boolean value ) {
			this.pojo.noErrorTruncation = (boolean)value;
			return this;
		}
		public Builder noImplicitAny( boolean value ) {
			this.pojo.noImplicitAny = (boolean)value;
			return this;
		}
		public Builder noLib( boolean value ) {
			this.pojo.noLib = (boolean)value;
			return this;
		}
		public Builder noResolve( boolean value ) {
			this.pojo.noResolve = (boolean)value;
			return this;
		}
		public Builder out( String value ) {
			this.pojo.out = (String)value;
			return this;
		}
		public Builder outFile( String value ) {
			this.pojo.outFile = (String)value;
			return this;
		}
		public Builder outDir( String value ) {
			this.pojo.outDir = (String)value;
			return this;
		}
		public Builder preserveConstEnums( boolean value ) {
			this.pojo.preserveConstEnums = (boolean)value;
			return this;
		}
		public Builder project( String value ) {
			this.pojo.project = (String)value;
			return this;
		}
		public Builder removeComments( boolean value ) {
			this.pojo.removeComments = (boolean)value;
			return this;
		}
		public Builder rootDir( String value ) {
			this.pojo.rootDir = (String)value;
			return this;
		}
		public Builder sourceMap( boolean value ) {
			this.pojo.sourceMap = (boolean)value;
			return this;
		}
		public Builder sourceRoot( String value ) {
			this.pojo.sourceRoot = (String)value;
			return this;
		}
		public Builder suppressExcessPropertyErrors( boolean value ) {
			this.pojo.suppressExcessPropertyErrors = (boolean)value;
			return this;
		}
		public Builder suppressImplicitAnyIndexErrors( boolean value ) {
			this.pojo.suppressImplicitAnyIndexErrors = (boolean)value;
			return this;
		}
		public Builder version( boolean value ) {
			this.pojo.version = (boolean)value;
			return this;
		}
		public Builder watch( boolean value ) {
			this.pojo.watch = (boolean)value;
			return this;
		}
		public Builder isolatedModules( boolean value ) {
			this.pojo.isolatedModules = (boolean)value;
			return this;
		}
		public Builder experimentalDecorators( boolean value ) {
			this.pojo.experimentalDecorators = (boolean)value;
			return this;
		}
		public Builder emitDecoratorMetadata( boolean value ) {
			this.pojo.emitDecoratorMetadata = (boolean)value;
			return this;
		}

		public CompilerOptions build() {
			return this.pojo;
		}
	}

	public String toString() {
		return "CompilerOptions@"+hashCode()+"[allowNonTsExtensions = "+allowNonTsExtensions()+", charset = "+charset()+", declaration = "+declaration()+", diagnostics = "+diagnostics()+", emitBOM = "+emitBOM()+", help = "+help()+", init = "+init()+", inlineSourceMap = "+inlineSourceMap()+", inlineSources = "+inlineSources()+", jsx = "+jsx()+", listFiles = "+listFiles()+", locale = "+locale()+", mapRoot = "+mapRoot()+", noEmit = "+noEmit()+", noEmitHelpers = "+noEmitHelpers()+", noEmitOnError = "+noEmitOnError()+", noErrorTruncation = "+noErrorTruncation()+", noImplicitAny = "+noImplicitAny()+", noLib = "+noLib()+", noResolve = "+noResolve()+", out = "+out()+", outFile = "+outFile()+", outDir = "+outDir()+", preserveConstEnums = "+preserveConstEnums()+", project = "+project()+", removeComments = "+removeComments()+", rootDir = "+rootDir()+", sourceMap = "+sourceMap()+", sourceRoot = "+sourceRoot()+", suppressExcessPropertyErrors = "+suppressExcessPropertyErrors()+", suppressImplicitAnyIndexErrors = "+suppressImplicitAnyIndexErrors()+", version = "+version()+", watch = "+watch()+", isolatedModules = "+isolatedModules()+", experimentalDecorators = "+experimentalDecorators()+", emitDecoratorMetadata = "+emitDecoratorMetadata()+"]";
	}
}
