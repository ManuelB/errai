/*
 * Copyright 2012 JBoss, a division of Red Hat.
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
package org.jboss.errai.databinding.client.api;

/**
 * Dispatched when a bound property has changed.
 *
 * @author David Cracauer <dcracauer@gmail.com>
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public class PropertyChangeEvent<T> {
  private final Object source;
  private final String propertyName;
  private final T oldValue;
  private final T newValue;

  public PropertyChangeEvent(Object source, String propertyName, T oldValue, T newValue) {
    this.source = source;
    this.propertyName = propertyName;
    this.oldValue = oldValue;
    this.newValue = newValue;
  }

  /**
   * Gets the new value of the property.
   *
   * @return new property value.
   */
  public T getNewValue() {
    return newValue;
  }

  /**
   * Gets the old value of the property.
   *
   * @return old property value.
   */
  public T getOldValue() {
    return oldValue;
  }

  /**
   * Gets the property name.
   *
   * @return the property name.
   */
  public String getPropertyName() {
    return propertyName;
  }

  /**
   * Gets the object on which the Event initially occurred.
   * 
   * @return the source object.
   */
  public Object getSource() {
    return source;
  }
}