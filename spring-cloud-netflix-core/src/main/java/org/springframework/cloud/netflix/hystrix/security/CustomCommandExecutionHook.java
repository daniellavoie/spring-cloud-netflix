/*
 * Copyright 2013-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.hystrix.security;

import com.netflix.hystrix.HystrixInvokable;
import com.netflix.hystrix.strategy.executionhook.HystrixCommandExecutionHook;

/**
 * <p>
 * Provides an extension mecanism to a regular {@link HystrixCommandExecutionHook}.
 * </p>
 * 
 * <p>
 * Spring Cloud Hystrix registers a {@link HystrixCommandExecutionHook} in order to give
 * access to the Spring Security SecurityContext from an Hystrix execution thread. Hystrix
 * does not allow to register more than one HystrixCommandExecutionHook.
 * </p>
 * <p>
 * Any CustomCommandExecutionHook implementation available inside the Spring container
 * will be called, thus providing an extension endpoint to the Hystrix hook.
 * </p>
 * @author daniellavoie
 *
 */
public interface CustomCommandExecutionHook {
	<T> void onExecutionStart(HystrixInvokable<T> commandInstance);
}
