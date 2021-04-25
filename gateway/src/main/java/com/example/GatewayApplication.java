package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


@Slf4j
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}


	@Bean
	public WebClient.Builder loadBalancedWebClientBuilder() {
		final WebClient.Builder builder = WebClient.builder();
		return builder;
	}

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//			.route(p -> p
//				.path("/core")
////				.filters(f -> f.addRequestHeader("Hello", "World"))
//			//	.
//				.uri("http://localhost:8081/core/ok"))
//			.build();
//	}


//
//	@Bean
//	public GlobalFilter customFilter() {
//		return new CustomGlobalFilter();
//	}
//
//	public class CustomGlobalFilter implements GlobalFilter, Ordered {
//
//		@Override
//		public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//			log.info("custom global filter");
//			return chain.filter(exchange);
//		}
//
//		@Override
//		public int getOrder() {
//			return -1;
//		}
//	}

}
