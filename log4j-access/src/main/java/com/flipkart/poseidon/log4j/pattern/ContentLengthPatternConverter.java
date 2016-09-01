/*
 * Copyright 2016 Flipkart Internet, pvt ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.poseidon.log4j.pattern;

import com.flipkart.poseidon.log4j.message.IAccessLog;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.PatternConverter;

/**
 * Log4J plugin to convert keys in patterns. Converts contentLength key in pattern.
 * <p/>
 * Created by mohan.pandian on 31/08/16.
 */
@Plugin(name = "ContentLengthPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"contentLength"})
public class ContentLengthPatternConverter extends AccessLogPatternConverter {
    public static ContentLengthPatternConverter newInstance(final String[] options) {
        return new ContentLengthPatternConverter();
    }

    @Override
    protected void format(IAccessLog accessLog, StringBuilder stringBuilder) {
        stringBuilder.append(accessLog.getContentLength());
    }
}
