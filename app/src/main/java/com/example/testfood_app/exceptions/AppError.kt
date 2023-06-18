package com.example.testfood_app.exceptions

import java.lang.RuntimeException

sealed class AppError(var code:String): RuntimeException()

class ApiError( code: String):AppError(code)
class NetworkError :AppError("error_network")
class DbError :AppError("error_database")
class UnknownError :AppError("error_unknown")