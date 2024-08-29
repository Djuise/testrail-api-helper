package testRailApi.api

import okhttp3.Credentials

class TestRail(url: String, private val username: String, private val password: String) {

    constructor(url: String, apiToken: String): this(url, apiToken, String())

    val token = Credentials.basic(username, password)

    public val pToken = token
}