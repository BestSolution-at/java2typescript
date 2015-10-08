package at.bestsolution.typescript.service.api.internal.local;

import at.bestsolution.typescript.service.api.TSServerConfiguration;
import at.bestsolution.typescript.service.api.model.*;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import java.util.concurrent.Future;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LocalTSService implements at.bestsolution.typescript.service.api.services.TSService {
	private AtomicInteger requestCount = new AtomicInteger();
	private Map<Integer,CompletableFuture<JsonObject>> waitingResponseConsumerMap = new HashMap<>();
	private Process p;
	private TSServerConfiguration configuration;
	private String tsServer = "";
	private String id;

	private final java.util.List<java.util.function.Consumer<DiagnosticEventBody>> syntaxDiagConsumerList = new java.util.ArrayList<>();
	private final java.util.List<java.util.function.Consumer<DiagnosticEventBody>> semanticDiagConsumerList = new java.util.ArrayList<>();

	public LocalTSService(TSServerConfiguration configuration, String id) {
		this.id = id;
		this.configuration = configuration;

		if( this.configuration != null ) {
			configuration.addConfigurationChangeConsumer(this::handleConfigurationChange);
		}
		startServer();
	}

	private void handleConfigurationChange(String serverBinary) {
		startServer();
	}

	public TextSpan[] brace(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("brace",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				TextSpan[] rv = new TextSpan[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), TextSpan.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void change(int line, int offset, int endLine, int endOffset, String insertString, String file) {
		sendVoidRequest("change",/* requestObject */ null);
	}
	public void close(String file) {
		sendVoidRequest("close",/* requestObject */ null);
	}
	public CompletionEntry[] completions(int line, int offset, String prefix, String file) {
		try {
			JsonObject o = sendRequest("completions",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				CompletionEntry[] rv = new CompletionEntry[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), CompletionEntry.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public CompletionEntryDetails[] completionEntryDetails(int line, int offset, String[] entryNames, String file) {
		try {
			JsonObject o = sendRequest("completionEntryDetails",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				CompletionEntryDetails[] rv = new CompletionEntryDetails[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), CompletionEntryDetails.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void configure(String hostInfo, String file, FormatOptions formatOptions) {
		sendVoidRequest("configure",/* requestObject */ null);
	}
	public FileSpan[] definition(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("definition",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				FileSpan[] rv = new FileSpan[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), FileSpan.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void exit() {
		sendVoidRequest("exit",null);
	}
	public CodeEdit[] format(int line, int offset, int endLine, int endOffset, String file) {
		try {
			JsonObject o = sendRequest("format",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				CodeEdit[] rv = new CodeEdit[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), CodeEdit.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public CodeEdit[] formatonkey(int line, int offset, String key, String file) {
		try {
			JsonObject o = sendRequest("formatonkey",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				CodeEdit[] rv = new CodeEdit[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), CodeEdit.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void geterr(int delay, String[] files) {
		sendVoidRequest("geterr",/* requestObject */ null);
	}
	public void geterrForProject(int delay, String file) {
		sendVoidRequest("geterrForProject",/* requestObject */ null);
	}
	public NavigationBarItem[] navbar(String file) {
		try {
			JsonObject o = sendRequest("navbar",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				NavigationBarItem[] rv = new NavigationBarItem[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), NavigationBarItem.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public NavtoItem[] navto(String searchValue, String file, int maxResultCount) {
		try {
			JsonObject o = sendRequest("navto",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				NavtoItem[] rv = new NavtoItem[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), NavtoItem.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public OccurrencesResponseItem[] occurrences(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("occurrences",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				OccurrencesResponseItem[] rv = new OccurrencesResponseItem[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), OccurrencesResponseItem.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public DocumentHighlightsItem[] documentHighlights(int line, int offset, String file, String[] filesToSearch) {
		try {
			JsonObject o = sendRequest("documentHighlights",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				DocumentHighlightsItem[] rv = new DocumentHighlightsItem[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), DocumentHighlightsItem.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void open(String file) {
		sendVoidRequest("open",/* requestObject */ null);
	}
	public QuickInfoResponseBody quickinfo(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("quickinfo",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), QuickInfoResponseBody.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public ReferencesResponseBody references(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("references",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), ReferencesResponseBody.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void reload(String file, String tmpfile) {
		sendVoidRequest("reload",/* requestObject */ null);
	}
	public RenameResponseBody rename(int line, int offset, String file, boolean findInComments, boolean findInStrings) {
		try {
			JsonObject o = sendRequest("rename",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), RenameResponseBody.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void saveto(String file, String tmpfile) {
		sendVoidRequest("saveto",/* requestObject */ null);
	}
	public SignatureHelpItems signatureHelp(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("signatureHelp",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), SignatureHelpItems.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public FileSpan[] typeDefinition(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("typeDefinition",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				FileSpan[] rv = new FileSpan[ar.size()];

				for( int i = 0; i < ar.size(); i++ ) {
					rv[i] = new com.google.gson.Gson().fromJson(o.get("body"), FileSpan.class);
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public ProjectInfo projectInfo(String file, boolean needFileNameList) {
		try {
			JsonObject o = sendRequest("projectInfo",/* requestObject */ null).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), ProjectInfo.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void reloadProjects() {
		sendVoidRequest("reloadProjects",null);
	}
	public at.bestsolution.typescript.service.api.Registration syntaxDiag(java.util.function.Consumer<DiagnosticEventBody> consumer) {
		return () -> {};
	}
	public at.bestsolution.typescript.service.api.Registration semanticDiag(java.util.function.Consumer<DiagnosticEventBody> consumer) {
		return () -> {};
	}

	private void startServer() {
		if(p != null && p.isAlive() ) {
			p.destroy();
		}
		String binary = configuration == null ? tsServer : configuration.getServerBinary();

		try {
			p = Runtime.getRuntime().exec(binary);

			Thread t = new Thread() {
				public void run() {
					try {
						BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String l = null;
						while( (l = r.readLine()) != null ) {
							dispatch(l);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.setDaemon(true);
			t.start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void dispatch(String input) {
		com.google.gson.JsonParser p = new com.google.gson.JsonParser();
		com.google.gson.JsonObject root = (com.google.gson.JsonObject) p.parse(input);

		String type = root.get("type").getAsString();

		if( "event".equals(type) && root.has("event") ) {
			switch(root.get("event").getAsString()) {
				case "syntaxDiag": {
					DiagnosticEventBody o = new com.google.gson.Gson().fromJson(root.get("body"), DiagnosticEventBody.class);
					java.util.List<java.util.function.Consumer<DiagnosticEventBody>> l;

					synchronized(syntaxDiagConsumerList) {
						l = new java.util.ArrayList<>(syntaxDiagConsumerList);
					}
					l.stream().forEach( c -> c.accept(o));
					break;
				}
				case "semanticDiag": {
					DiagnosticEventBody o = new com.google.gson.Gson().fromJson(root.get("body"), DiagnosticEventBody.class);
					java.util.List<java.util.function.Consumer<DiagnosticEventBody>> l;

					synchronized(semanticDiagConsumerList) {
						l = new java.util.ArrayList<>(semanticDiagConsumerList);
					}
					l.stream().forEach( c -> c.accept(o));
					break;
				}
				default:
					break;
			}
		} else if( "response".equals(type) && root.has("request_seq") ) {
			Integer id = root.get("request_seq").getAsInt();
			CompletableFuture<JsonObject> future;
			synchronized(waitingResponseConsumerMap) {
				future = waitingResponseConsumerMap.remove(id);
			}

			if( future != null ) {
				future.complete(root);
			}
		}
	}

	private Future<JsonObject> sendRequest(String method, Object request) {
		CompletableFuture<JsonObject> f = new CompletableFuture<>();
		Integer seq = requestCount.incrementAndGet();

		synchronized(waitingResponseConsumerMap) {
			waitingResponseConsumerMap.put(seq, f);
		}

		sendVoidRequest(method,request);

		return f;
	}

	private void sendVoidRequest(String method, Object request) {
		String r = "{ \"seq\" : seq, \"type\" : \"command\"";
		if( request != null ) {
			r += ", \"arguments\" :  " + new Gson().toJson(request);
		}
		r += "}";
		r = r.replace('\n', ' ');
		r = r.replace('\r', ' ');
		r += "\n";
		try {
			p.getOutputStream().write(r.getBytes());
			p.getOutputStream().flush();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
