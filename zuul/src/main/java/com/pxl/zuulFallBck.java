package com.pxl;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

public class zuulFallBck implements FallbackProvider{

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "aaaaaaaaa";
	}

	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientHttpResponse fallbackResponse(Throwable cause) {
		// TODO Auto-generated method stub
		return new ClientHttpResponse() {
			
			@Override
			public HttpHeaders getHeaders() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getBody() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return "message:"+cause.getMessage()+
						"  class:"+cause.getClass()+
						"  cause"+cause.getCause();
			}
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.NOT_FOUND;
			}
			
			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.NOT_FOUND.value();
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
