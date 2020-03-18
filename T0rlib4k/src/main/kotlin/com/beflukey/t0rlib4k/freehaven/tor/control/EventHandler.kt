// Copyright 2005 Nick Mathewson, Roger Dingledine
// See LICENSE file for copying information
package com.beflukey.t0rlib4k.freehaven.tor.control

/**
 * Abstract interface whose methods are invoked when Tor sends us an event.
 *
 *
 * @see [TorControlConnection::setEventHandler]
 * @see [TorControlConnection::setEvents]
 */
interface EventHandler {

    fun circuitStatus(status: String, circID: String, path: String)

    fun streamStatus(status: String, streamID: String, target: String)

    fun orConnStatus(status: String, orName: String)

    fun bandwidthUsed(read: Long, written: Long)

    fun newDescriptors(orSet: Set<String>)

    fun message(severity: String, msg: String)
}