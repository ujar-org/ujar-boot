/*
 * Copyright 2024 IQKV.
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
 */

package com.iqkv.boot.info;

/**
 * App runtime constants.
 */
public final class Constants {

  public static final String SYSTEM = "system";

  /**
   * Constant <code>SPRING_PROFILE_DEVELOPMENT="dev"</code>
   */
  public static final String SPRING_PROFILE_DEVELOPMENT = "dev";

  /**
   * Constant <code>SPRING_PROFILE_TEST="test"</code>
   */
  public static final String SPRING_PROFILE_TEST = "test";

  /**
   * Constant <code>SPRING_PROFILE_PRODUCTION="prod"</code>
   */
  public static final String SPRING_PROFILE_PRODUCTION = "prod";


  private Constants() {
  }
}