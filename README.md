應用 [proguard-logging-rules.pro](https://gist.github.com/tw-Frey/047c54ddf060d38fd97671cd9948b3ef)  

並比較四種情況，如下

[proguard-logging-rules.pro](https://gist.github.com/tw-Frey/047c54ddf060d38fd97671cd9948b3ef)|debuggable = false|debuggable = true
:--|:-:|:-:
套用 proguard-android-optimize|Logging **有** 移除|Logging **有** 移除
套用 proguard-android|Logging **有** 移除|Logging _無_ 移除

\
編譯環境
1. R8 且 minifyEnabled = true
1. Android Tools 4.1.3 / Gradle 6.5
1. Android Tools 7.1.0-alpha10 / Gradle 7.2
