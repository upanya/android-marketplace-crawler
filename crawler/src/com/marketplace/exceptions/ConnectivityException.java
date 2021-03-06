/* 
 * Copyright (c) 2011 Raunak Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.marketplace.exceptions;

/**
 * <code>ConnectivityException</code> can be used to indicate when there are
 * connectivity issues between the crawler and the underlying database which
 * stores all the information about an app.
 * 
 * @author raunak
 * @version 1.0
 */
public class ConnectivityException extends Exception {

	private static final long serialVersionUID = -528182965388732238L;

	public ConnectivityException(String message) {
		super(message);
	}

}
