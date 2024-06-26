/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.sql.legacy.domain.hints;

/** Created by Eliran on 29/8/2015. */
public enum HintType {
  HASH_WITH_TERMS_FILTER,
  JOIN_LIMIT,
  USE_NESTED_LOOPS,
  NL_MULTISEARCH_SIZE,
  USE_SCROLL,
  IGNORE_UNAVAILABLE,
  DOCS_WITH_AGGREGATION,
  ROUTINGS,
  SHARD_SIZE,
  HIGHLIGHT,
  MINUS_FETCH_AND_RESULT_LIMITS,
  MINUS_USE_TERMS_OPTIMIZATION,
  COLLAPSE,
  POST_FILTER,
  JOIN_ALGORITHM_BLOCK_SIZE,
  JOIN_ALGORITHM_USE_LEGACY,
  JOIN_SCROLL_PAGE_SIZE,
  JOIN_CIRCUIT_BREAK_LIMIT,
  JOIN_BACK_OFF_RETRY_INTERVALS,
  JOIN_TIME_OUT
}
