# no logging in production
# https://medium.com/yazio-engineering/6566bc387b63
-assumenosideeffects class android.util.Log {
  v(...);
  d(...);
  i(...);
  w(...);
  e(...);
  wtf(...);
  println(...);
}
# 不要把 isLoggable 去邊際化, 它是有用的, 應該要用 -assumevalues 植入期待植 (旁白 by FY)