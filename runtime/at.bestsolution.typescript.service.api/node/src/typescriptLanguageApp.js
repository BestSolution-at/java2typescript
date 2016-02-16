/// <reference path="../typings/node.d.ts" />
/// <reference path="languageService.ts" />
var TypeScriptServiceAPI;
(function (TypeScriptServiceAPI) {
    var Main = (function () {
        function Main() {
            this.dispatcher = new TypeScriptServiceAPI.ServiceDispatcher();
        }
        Main.prototype.launch = function () {
            var _this = this;
            var lineReader = require("readline");
            var rl = lineReader.createInterface(process.stdin, process.stdout);
            rl.on("line", function (line) {
                console.log(_this.dispatcher.invokeMethod(line));
            });
        };
        return Main;
    }());
    TypeScriptServiceAPI.Main = Main;
})(TypeScriptServiceAPI || (TypeScriptServiceAPI = {}));
var main = new TypeScriptServiceAPI.Main();
main.launch();
// { "requestId" : 1, "service" : "languageService", "method" : "createProject", "parameters" : [ "MyProject" ] }
// { "requestId" : 1, "service" : "simpleService", "method" : "testSimpleObjectRV", "parameters" : [] }
// { "requestId" : 2, "service" : "simpleService", "method" : "testListRV", "parameters" : [] }
