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

package org.springframework.cloud.netflix.hystrix.security.app;

import org.springframework.cloud.netflix.hystrix.security.CustomCommandExecutionHook;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.HystrixInvokable;

/**
 * @author Daniel Lavoie
 */
@Component
public class CustomCommandExecutionHookImpl implements CustomCommandExecutionHook {
	private boolean hookCalled;

	@Override
	public <T> void onExecutionStart(HystrixInvokable<T> commandInstance) {
		hookCalled = true;
	}

	public boolean isHookCalled() {
		return hookCalled;
	}
}
