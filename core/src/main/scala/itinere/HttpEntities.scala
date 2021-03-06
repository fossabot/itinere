package itinere

trait HttpMethods[A] {
  // $COVERAGE-OFF$Too many methods to test
  val ACL: A
  val `BASELINE-CONTROL`: A
  val BIND: A
  val CHECKIN: A
  val CHECKOUT: A
  val CONNECT: A
  val COPY: A
  val DELETE: A
  val GET: A
  val HEAD: A
  val LABEL: A
  val LINK: A
  val LOCK: A
  val MERGE: A
  val MKACTIVITY: A
  val MKCALENDAR: A
  val MKCOL: A
  val MKREDIRECTREF: A
  val MKWORKSPACE: A
  val MOVE: A
  val OPTIONS: A
  val ORDERPATCH: A
  val PATCH: A
  val POST: A
  val PROPFIND: A
  val PROPPATCH: A
  val PUT: A
  val REBIND: A
  val REPORT: A
  val SEARCH: A
  val TRACE: A
  val UNBIND: A
  val UNCHECKOUT: A
  val UNLINK: A
  val UNLOCK: A
  val UPDATE: A
  val UPDATEREDIRECTREF: A
  val `VERSION-CONTROL`: A
  // $COVERAGE-ON$
}

trait HttpStatusCodes[A] {
  // $COVERAGE-OFF$Too many codes to test
  val Continue: A
  val SwitchingProtocols: A
  val Processing: A
  val EarlyHints: A
  val Ok: A
  val Created: A
  val Accepted: A
  val NonAuthoritativeInformation: A
  val NoContent: A
  val ResetContent: A
  val PartialContent: A
  val MultiStatus: A
  val AlreadyReported: A
  val IMUsed: A
  val MultipleChoices: A
  val MovedPermanently: A
  val Found: A
  val SeeOther: A
  val NotModified: A
  val UseProxy: A
  val TemporaryRedirect: A
  val PermanentRedirect: A
  val BadRequest: A
  val Unauthorized: A
  val PaymentRequired: A
  val Forbidden: A
  val NotFound: A
  val MethodNotAllowed: A
  val NotAcceptable: A
  val ProxyAuthenticationRequired: A
  val RequestTimeout: A
  val Conflict: A
  val Gone: A
  val LengthRequired: A
  val PreconditionFailed: A
  val PayloadTooLarge: A
  val UriTooLong: A
  val UnsupportedMediaType: A
  val RangeNotSatisfiable: A
  val ExpectationFailed: A
  val MisdirectedRequest: A
  val UnprocessableEntity: A
  val Locked: A
  val FailedDependency: A
  val TooEarly: A
  val UpgradeRequired: A
  val PreconditionRequired: A
  val TooManyRequests: A
  val RequestHeaderFieldsTooLarge: A
  val UnavailableForLegalReasons: A
  val InternalServerError: A
  val NotImplemented: A
  val BadGateway: A
  val ServiceUnavailable: A
  val GatewayTimeout: A
  val HttpVersionNotSupported: A
  val VariantAlsoNegotiates: A
  val InsufficientStorage: A
  val LoopDetected: A
  val NotExtended: A
  val NetworkAuthenticationRequired: A
  // $COVERAGE-ON$
}
