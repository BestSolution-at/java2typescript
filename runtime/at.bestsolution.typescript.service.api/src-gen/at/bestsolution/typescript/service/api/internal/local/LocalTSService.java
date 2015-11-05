package at.bestsolution.typescript.service.api.internal.local;

import at.bestsolution.typescript.service.api.TSServerConfiguration;
import at.bestsolution.typescript.service.api.model.*;
import at.bestsolution.typescript.service.api.pojo.model.*;
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
	private String tsServer = "/usr/local/bin/tsserver";
	private String id;
	private int seqCount;

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

	public java.util.List<? extends TextSpan> brace(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("brace",new at.bestsolution.typescript.service.api.internal.BraceRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<TextSpanPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), TextSpanPojo.class));
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
		sendVoidRequest("change",new at.bestsolution.typescript.service.api.internal.ChangeRequest(line, offset, endLine, endOffset, insertString, file));
	}
	public void close(String file) {
		sendVoidRequest("close",new at.bestsolution.typescript.service.api.internal.CloseRequest(file));
	}
	public java.util.List<? extends CompletionEntry> completions(int line, int offset, String prefix, String file) {
		try {
			JsonObject o = sendRequest("completions",new at.bestsolution.typescript.service.api.internal.CompletionsRequest(line, offset, prefix, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<CompletionEntryPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), CompletionEntryPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends CompletionEntryDetails> completionEntryDetails(int line, int offset, java.util.List<? extends String> entryNames, String file) {
		try {
			JsonObject o = sendRequest("completionEntryDetails",new at.bestsolution.typescript.service.api.internal.CompletionEntryDetailsRequest(line, offset, entryNames, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<CompletionEntryDetailsPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), CompletionEntryDetailsPojo.class));
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
		sendVoidRequest("configure",new at.bestsolution.typescript.service.api.internal.ConfigureRequest(hostInfo, file, formatOptions));
	}
	public java.util.List<? extends FileSpan> definition(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("definition",new at.bestsolution.typescript.service.api.internal.DefinitionRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<FileSpanPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), FileSpanPojo.class));
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
	public java.util.List<? extends CodeEdit> format(int line, int offset, int endLine, int endOffset, String file) {
		try {
			JsonObject o = sendRequest("format",new at.bestsolution.typescript.service.api.internal.FormatRequest(line, offset, endLine, endOffset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<CodeEditPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), CodeEditPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends CodeEdit> formatonkey(int line, int offset, String key, String file) {
		try {
			JsonObject o = sendRequest("formatonkey",new at.bestsolution.typescript.service.api.internal.FormatonkeyRequest(line, offset, key, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<CodeEditPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), CodeEditPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void geterr(int delay, java.util.List<? extends String> files) {
		sendVoidRequest("geterr",new at.bestsolution.typescript.service.api.internal.GeterrRequest(delay, files));
	}
	public void geterrForProject(int delay, String file) {
		sendVoidRequest("geterrForProject",new at.bestsolution.typescript.service.api.internal.GeterrForProjectRequest(delay, file));
	}
	public java.util.List<? extends NavigationBarItem> navbar(String file) {
		try {
			JsonObject o = sendRequest("navbar",new at.bestsolution.typescript.service.api.internal.NavbarRequest(file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<NavigationBarItemPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), NavigationBarItemPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends NavtoItem> navto(String searchValue, String file, int maxResultCount) {
		try {
			JsonObject o = sendRequest("navto",new at.bestsolution.typescript.service.api.internal.NavtoRequest(searchValue, file, maxResultCount)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<NavtoItemPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), NavtoItemPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends OccurrencesResponseItem> occurrences(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("occurrences",new at.bestsolution.typescript.service.api.internal.OccurrencesRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<OccurrencesResponseItemPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), OccurrencesResponseItemPojo.class));
				}
				return rv;
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends DocumentHighlightsItem> documentHighlights(int line, int offset, String file, java.util.List<? extends String> filesToSearch) {
		try {
			JsonObject o = sendRequest("documentHighlights",new at.bestsolution.typescript.service.api.internal.DocumentHighlightsRequest(line, offset, file, filesToSearch)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<DocumentHighlightsItemPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), DocumentHighlightsItemPojo.class));
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
		sendVoidRequest("open",new at.bestsolution.typescript.service.api.internal.OpenRequest(file));
	}
	public QuickInfoResponseBody quickinfo(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("quickinfo",new at.bestsolution.typescript.service.api.internal.QuickinfoRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), QuickInfoResponseBodyPojo.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public ReferencesResponseBody references(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("references",new at.bestsolution.typescript.service.api.internal.ReferencesRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), ReferencesResponseBodyPojo.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void reload(String file, String tmpfile) {
		sendVoidRequest("reload",new at.bestsolution.typescript.service.api.internal.ReloadRequest(file, tmpfile));
	}
	public RenameResponseBody rename(int line, int offset, String file, boolean findInComments, boolean findInStrings) {
		try {
			JsonObject o = sendRequest("rename",new at.bestsolution.typescript.service.api.internal.RenameRequest(line, offset, file, findInComments, findInStrings)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), RenameResponseBodyPojo.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public void saveto(String file, String tmpfile) {
		sendVoidRequest("saveto",new at.bestsolution.typescript.service.api.internal.SavetoRequest(file, tmpfile));
	}
	public SignatureHelpItems signatureHelp(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("signatureHelp",new at.bestsolution.typescript.service.api.internal.SignatureHelpRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), SignatureHelpItemsPojo.class);
			} else {
				throw new IllegalStateException("Requested failed");
			}
		} catch (InterruptedException | java.util.concurrent.ExecutionException e) {
			throw new IllegalStateException(e);
		}
	}
	public java.util.List<? extends FileSpan> typeDefinition(int line, int offset, String file) {
		try {
			JsonObject o = sendRequest("typeDefinition",new at.bestsolution.typescript.service.api.internal.TypeDefinitionRequest(line, offset, file)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				com.google.gson.JsonArray ar = o.get("body").getAsJsonArray();
				java.util.List<FileSpanPojo> rv = new java.util.ArrayList<>(ar.size());

				for( int i = 0; i < ar.size(); i++ ) {
					rv.add(new com.google.gson.Gson().fromJson(ar.get(i), FileSpanPojo.class));
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
			JsonObject o = sendRequest("projectInfo",new at.bestsolution.typescript.service.api.internal.ProjectInfoRequest(file, needFileNameList)).get();
			if( o.has("success") && o.get("success").getAsBoolean() ) {
				return new com.google.gson.Gson().fromJson(o.get("body"), ProjectInfoPojo.class);
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
		syntaxDiagConsumerList.add(consumer);
		return () -> {
			syntaxDiagConsumerList.remove(consumer);
		};
	}
	public at.bestsolution.typescript.service.api.Registration semanticDiag(java.util.function.Consumer<DiagnosticEventBody> consumer) {
		semanticDiagConsumerList.add(consumer);
		return () -> {
			semanticDiagConsumerList.remove(consumer);
		};
	}

	private void startServer() {
		if(p != null && p.isAlive() ) {
			p.destroy();
		}
		String binary = configuration == null ? tsServer : configuration.getServerBinary();

		try {
			p = Runtime.getRuntime().exec(binary, new String[] { "PATH=$PATH:/usr/local/bin" }); //TODO Linux & Windows???

			Thread t = new Thread() {
				public void run() {
					try {
						BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
						String l = null;
						while( (l = r.readLine()) != null ) {
							if( l.startsWith("{") ) {
								dispatch(l);
							}
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
					DiagnosticEventBody o = new com.google.gson.Gson().fromJson(root.get("body"), DiagnosticEventBodyPojo.class);
					java.util.List<java.util.function.Consumer<DiagnosticEventBody>> l;

					synchronized(syntaxDiagConsumerList) {
						l = new java.util.ArrayList<>(syntaxDiagConsumerList);
					}
					l.stream().forEach( c -> c.accept(o));
					break;
				}
				case "semanticDiag": {
					DiagnosticEventBody o = new com.google.gson.Gson().fromJson(root.get("body"), DiagnosticEventBodyPojo.class);
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
		Integer seq = requestCount.getAndIncrement();

		synchronized(waitingResponseConsumerMap) {
			waitingResponseConsumerMap.put(seq, f);
		}

		String r = "{ \"seq\" : "+ seq +", \"type\" : \"request\", \"command\" : \""+method+"\"";
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

		return f;
	}

	private void sendVoidRequest(String method, Object request) {
		String r = "{ \"seq\" : "+ requestCount.getAndIncrement() +", \"type\" : \"request\", \"command\" : \""+method+"\"";
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
