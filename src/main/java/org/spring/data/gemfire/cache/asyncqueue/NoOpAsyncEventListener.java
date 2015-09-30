/*
 * Copyright 2014-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spring.data.gemfire.cache.asyncqueue;

import java.util.List;

import com.gemstone.gemfire.cache.asyncqueue.AsyncEvent;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEventListener;

/**
 * The NoOpAsyncEventListener class is an implementation of AsyncEventListener that does nothing.
 *
 * @author John Blum
 * @see com.gemstone.gemfire.cache.asyncqueue.AsyncEvent
 * @see com.gemstone.gemfire.cache.asyncqueue.AsyncEventListener
 * @since 1.0.0
 */
public class NoOpAsyncEventListener implements AsyncEventListener {

  @Override
  public boolean processEvents(final List<AsyncEvent> events) {
    return false;
  }

  @Override
  public void close() {
  }

}