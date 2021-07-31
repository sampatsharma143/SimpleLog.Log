# SimpleLog.Log


SimpleLog.Log library can help you to log the output easily wihout mannually writing code to print debug log or error log.







![Android Log Library](/../master/LogDemo.jpeg?raw=true "Demo App ScreenShot")


# How to add in your project

* Step 1. Add the JitPack repository to your build file
* Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ```
  
  * Step 2. Add the dependency
  
  
  ```
  dependencies {
	         implementation 'com.github.sampatsharma143:SimpleLog.Log:1.0.0'
	}
  
  ```


#HOW TO LOG

#String Log

``` Log.e("STRING LOG","Normal String Message"); ```


#String & Int Log

```         Log.e("INT STRING LOG",100," string & int message"); ```

#Boolean & String Log

```        Log.e("BOOL STRING LOG",true," string & boolean message"); ```

#String Array & int Log

```         Log.e("STRING ARRAY INT LOG",2,new String[]{"  message 1 "," Message 2 "," Message 3"}); ```

#Strin Array Log

```         Log.e("STRING ARRAY  LOG",new String[]{"  message 1 "," Message 2 "," Message 3"}); ```


#Boolean Log

```         Log.e("BOOL  LOG",true); ```

#Int Log

```        Log.e("INT  LOG",1); ```

#String Map Log

```    
Map<String,String> logValues = new HashMap<String, String>();
        logValues.put("TAG 1","Message 1");
        logValues.put("TAG 2","Message 2");
        logValues.put("TAG 3","Message 3");
        logValues.put("TAG 4","Message 4");
        Log.e(logValues);

```


#OUTPUTS

```E/STRING LOG: Normal String Message


E/INT STRING LOG: 100  string & int message

E/BOOL STRING LOG: true  string & boolean message

E/STRING ARRAY INT LOG: 2   message 1   Message 2   Message 3


E/STRING ARRAY  LOG:    message 1   Message 2   Message 3

E/BOOL  LOG: true

E/INT  LOG: 1

E/TAG 4: Message 4
E/TAG 2: Message 2
E/TAG 3: Message 3
E/TAG 1: Message 1



```
