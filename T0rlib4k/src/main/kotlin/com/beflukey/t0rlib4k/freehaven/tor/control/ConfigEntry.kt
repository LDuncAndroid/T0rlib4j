// Copyright 2005 Nick Mathewson, Roger Dingledine
// See LICENSE file for copying information
package com.beflukey.t0rlib4k.freehaven.tor.control

/** A single key-value pair from Tor's configuration. */
data class ConfigEntry(private val k: String, private val v: String, private val isDefault: Boolean = false)