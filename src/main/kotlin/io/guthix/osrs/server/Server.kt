/*
Copyright (C) 2019 Guthix

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.guthix.osrs.server

import io.guthix.osrs.server.net.networkBootstrap
import io.guthix.osrs.server.serialization.GameConfig
import io.guthix.osrs.server.serialization.NetworkConfig
import io.guthix.osrs.server.serialization.SecurityConfig

lateinit var gameConfig: GameConfig

lateinit var networkConfig: NetworkConfig

lateinit var securityConfig: SecurityConfig

fun main(args: Array<String>) {
    gameConfig = loadConfiguration("game")
    networkConfig = loadConfiguration("network")
    securityConfig = loadConfiguration("security")
    networkBootstrap(networkConfig.port)
}