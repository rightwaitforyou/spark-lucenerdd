/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zouzias.spark.lucenerdd.aggregate

import com.twitter.algebird.TopKMonoid
import org.zouzias.spark.lucenerdd.config.LuceneRDDConfigurable
import org.zouzias.spark.lucenerdd.models.SparkScoreDoc

/**
 * TopK monoid to aggregate [[SparkScoreDoc]]
 *
 * Used to aggregate the top-k documents from the executors to the driver
 */
trait SparkScoreDocAggregatable extends LuceneRDDConfigurable {

  protected val SparkDocTopKMonoid = new TopKMonoid[SparkScoreDoc](MaxDefaultTopKValue)
}
