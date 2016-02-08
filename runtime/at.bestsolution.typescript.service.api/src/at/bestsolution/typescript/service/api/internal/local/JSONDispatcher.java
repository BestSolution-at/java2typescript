package at.bestsolution.typescript.service.api.internal.local;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import at.bestsolution.typescript.service.api.services.Dispatcher;

public abstract class JSONDispatcher implements Dispatcher {
	private AtomicInteger requestCount = new AtomicInteger();

	protected abstract CompletableFuture<JsonObject> sendRequest(String request);

	@Override
	public void sendVoidRequest(String service, String method, Object... parameters) {
		String r = "{ \"requestId\" : "+ requestCount.getAndIncrement() +", \"service\" : \""+service+"\", \"method\" : \""+method+"\"";
		if( parameters.length > 0 ) {
			r += ", \"parameters\" :  " + new Gson().toJson(parameters);
		}
		r += "}";
		r = r.replace('\n', ' ');
		r = r.replace('\r', ' ');
		r += "\n";
		try {
			sendRequest(r).get();
		} catch (InterruptedException | ExecutionException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public <T> CompletableFuture<T> sendSingleValueRequest(String service, String method, Class<T> clazz,
			Object... parameters) {
		String r = "{ \"requestId\" : "+ requestCount.getAndIncrement() +", \"service\" : \""+service+"\", \"method\" : \""+method+"\"";
		if( parameters.length > 0 ) {
			r += ", \"parameters\" :  " + new Gson().toJson(parameters);
		}
		r += "}";
		r = r.replace('\n', ' ');
		r = r.replace('\r', ' ');
		r += "\n";
		return sendRequest(r).thenApply( o -> {
			return new com.google.gson.Gson().fromJson(o.get("result"), clazz);
		});
	}

	@Override
	public <T> CompletableFuture<List<T>> sendMultiValueRequest(String service, String method, Class<T> clazz,
			Object... parameters) {
		String r = "{ \"requestId\" : "+ requestCount.getAndIncrement() +", \"service\" : \""+service+"\", \"method\" : \""+method+"\"";
		if( parameters.length > 0 ) {
			r += ", \"parameters\" :  " + new Gson().toJson(parameters);
		}
		r += "}";
		r = r.replace('\n', ' ');
		r = r.replace('\r', ' ');
		r += "\n";
		return sendRequest(r).thenApply( o -> {
			List<T> rv = new ArrayList<>();
			com.google.gson.JsonArray ar = o.get("result").getAsJsonArray();
			for( int i = 0; i < ar.size(); i++ ) {
				rv.add(new com.google.gson.Gson().fromJson(ar.get(i), clazz));
			}
			return rv;
		});
	}

}
