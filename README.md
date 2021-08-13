# Custom Android Library: User Manual

This is a library that contains reusable components to be implemented in future Android projects. The following features of this library are as listed below.
- [Instructions](#instructions)
- [Custom Feedback](#custom_feedback)
- [Custom UI Components](#custom_ui_components)
  - [Custom Edit Text](#custom_edit_text)
  - [Auto-adjust Text Size](#auto_adjust_text_size)
- [Resources](#resources)

---
## <a name="instructions"></a> Instructions
To implement this library, add this code snippet to your root build.gradle (project) at the end of your repositories:
```
maven { url 'https://jitpack.io' }
```
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
And add this dependency:
```
implementation 'com.github.janelletam:custom-android-library:2.0'
```
```
	dependencies {
	        implementation 'com.github.janelletam:custom-android-library:2.0'
	}
```

---
## <a name="custom_feedback"></a> Custom Feedback
The `CustomFeedback` class includes static methods that display visual feedback to the user, which can be incorporated into your Android project for use. These static methods are:
  * `showCorrectSnackbar()` → This displays a **green** snackbar at the bottom of the screen with a checkmark icon, which can be adjusted by adding a different drawable resource, as well as a message, which can be changed by going to the `strings` file and changing the text
  * `showIncorrectSnackbar()` → This displays a **red** snackbar at the bottom of the screen with a cross icon, which can be adjusted by adding a different drawable resource, as well as a message, which can be changed by going to the `strings` file and changing the text
  * `displayToastTop()` → This displays a custom toast with a message that can be changed by passing in a different string argument. The toast appears near the top of the screen, though the exact coordinates can be changed by going to the method declaration
  * `displayToastBottom()` → This displays a custom toast with a message that can be changed by passing in a different string argument. The toast appears near the bottom of the screen and is the default Android toast

---
## <a name="custom_ui_components"></a>  Custom UI Components

### <a name="custom_edit_text"></a> Custom Edit Test

`Custom Edit Text` → This library offers a template for an EditText with a custom background. The individual parameters as listed below can be changed by going to the `res` directory and changing the `dimens` file accordingly
  
#### Dimensions
```
    <dimen name="edit_text_width">250sp</dimen>
    <dimen name="edit_text_height">45dp</dimen>
    <dimen name="edit_text_padding_left">20dp</dimen>
    <dimen name="edit_text_size">18sp</dimen>
```
####  Full snippet
```
    <EditText
        android:id="@+id/edit_text_example"
        android:layout_marginStart="30dp"
        android:layout_marginLeft="30dp"
        android:layout_marginTop="50dp"
        android:layout_marginEnd="60dp"
        android:layout_marginRight="60dp"

        android:layout_width="@dimen/edit_text_width"
        android:layout_height="@dimen/edit_text_height"
        android:autofillHints="0"
        android:background="@drawable/general_edit_text_bg"
        android:paddingLeft="@dimen/edit_text_padding_left"
        android:textSize="@dimen/edit_text_size"

        android:ems="10"
        android:hint="Name"
        android:imeOptions="actionDone"
        android:inputType="textPersonName"
        android:text=""
        tools:ignore="LabelFor" />
```
#### Colours
```
    <!-- Edit text colours -->
    <color name="light_gray">#E8E9EA</color>
```
#### `general_edit_text_bg` Code
```
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/light_gray"/>
            <corners android:radius="8dp"/>
        </shape>
    </item>
</layer-list>
```

&nbsp;
---
### <a name="auto_adjust_text_size"></a> Auto-adjust Text Size
`Auto-adjust Text Size` → This library offers a template for a TextView that automatically adjust its font size depending on the amount of text and the dimensions of the TextView. The individual parameters as listed below can be changed by going to the `res` directory and changing the `dimens` file accordingly
 
#### Dimensions
  ```
    <dimen name="auto_text_width">250sp</dimen>
    <dimen name="auto_text_height">125sp</dimen>

    <dimen name="auto_text_max_size">23sp</dimen>
    <dimen name="auto_text_min_size">15sp</dimen>
    <dimen name="auto_text_reg_size">18sp</dimen>
```
####  Full snippet
```
    <TextView
        android:id="@+id/[rename]"
        android:layout_width="@dimen/auto_text_width"
        android:layout_height="@dimen/auto_text_height"
        android:autoSizeMaxTextSize="@dimen/auto_text_max_size"
        android:autoSizeMinTextSize="@dimen/auto_text_min_size"
        android:textSize="@dimen/auto_text_reg_size"
        android:autoSizeStepGranularity="1sp"
        android:autoSizeTextType="uniform"

        android:foregroundGravity="center"
        android:gravity="center"

        android:text=""
        android:textColor="" />
```

---
## <a name="resources"></a> Resources
  * [Markdown reference](https://www.markdownguide.org/cheat-sheet/)
