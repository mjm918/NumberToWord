# NumberToWord
Small library to convert numbers to english word.<br>
Example : `100` in english `One hundred` or `-224` in english `minus two hundred twenty four`
<br>
To use this library add the following in your android project app gradle:<br>
`compile 'com.github.mjm918:NumberToWord:1.0'`
<br>
Then add the following in project gradle:<br>
`allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}`
  
  # Finally call the function 
  <br> `NumberToWord.Convert(1001988);`
  
  # Limitations:
  <br>Right now it only converts positive or negative integers. No floating value is accepted.
