# no logging in production
# https://medium.com/yazio-engineering/6566bc387b63
# 不要把 isLoggable 去邊際化, 它是有用的, 應該要用 -assumevalues 植入期待植 (旁白 by FY)
-assumenosideeffects class android.util.Log {
  v(...);
  d(...);
  i(...);
  w(...);
  e(...);
  wtf(...);
  println(...);
}
###################################################################################################
# https://www.guardsquare.com/manual/configuration/usage
# With the option -assumevalues, fields and methods with primitive return types can have
# values or ranges of values. The assignment keyword is = or return, interchangeably.
# For example, "boolean flag = true;" or "int method() return 5;". Ranges of values are
# separated by .., for example, "int f = 100..200;". A range includes its begin value and end value.
###################################################################################################
# 不受 debuggable 影響, 但受 optimiz 影響
-assumevalues class android.util.Log {
    boolean isLoggable(...) return false;
}
###################################################################################################
# 0,1 非有效值
# VERBOSE = 2
# DEBUG = 3
# INFO = 4
# WARN = 5
# ERROR = 6
# ASSERT = 7
###################################################################################################
# 不受 optimiz 影響, 但受 debuggable 影響
-maximumremovedandroidloglevel 8