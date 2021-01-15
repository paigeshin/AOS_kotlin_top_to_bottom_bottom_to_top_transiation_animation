### bottom_slide_in

```xml
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:fromYDelta="100%p"
    android:duration="@android:integer/config_shortAnimTime"/>
```

### bottom_slide_out

```xml
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:fromYDelta="0"
    android:duration="@android:integer/config_shortAnimTime" />
```

### top_slide_in

```xml
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:toYDelta="0%p"
    android:duration="@android:integer/config_shortAnimTime" />
```

### top_slide_out

```xml
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:toYDelta="100%p"
    android:duration="@android:integer/config_shortAnimTime" />
```

### Activity1

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGo.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.bottom_slide_in, R.anim.bottom_slide_out)

        }

    }
}
```

### Activity2

```kotlin
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttonFinish.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.top_slide_in, R.anim.top_slide_out)
        }
    }
}
```