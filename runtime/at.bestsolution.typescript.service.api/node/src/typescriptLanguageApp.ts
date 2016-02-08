/// <reference path="../typings/node.d.ts" />
/// <reference path="languageService.ts" />

namespace TypeScriptServiceAPI {
	export class Main {
		private dispatcher : ServiceDispatcher;
		
		constructor() {
			this.dispatcher = new ServiceDispatcher();
		}
		public launch() {
			var lineReader = require("readline");
			var rl = lineReader.createInterface(process.stdin, process.stdout);
			
			rl.on("line", (line: string) => {
                console.log(this.dispatcher.invokeMethod(line));
            });
		}
	}
}

var main = new TypeScriptServiceAPI.Main();
main.launch();

// { "requestId" : 1, "service" : "languageService", "method" : "createProject", "parameters" : [ "MyProject" ] }


// { "requestId" : 1, "service" : "simpleService", "method" : "testSimpleObjectRV", "parameters" : [] }
// { "requestId" : 2, "service" : "simpleService", "method" : "testListRV", "parameters" : [] }
