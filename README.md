# HPermission [![](https://www.jitpack.io/v/huangdali/HPermission.svg)](https://www.jitpack.io/#huangdali/HPermission)

>Android 6.0 permission manager

## How to

To get a Git project into your build:

### Step 1. Add the JitPack repository to your build file


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
### Step 2. Add the dependency

	dependencies {
	        compile 'com.github.huangdali:HPermission:v1.0.4'
	}


### Use

```java
 HPermissions.getInstance().requestAllManifestPermissionsIfNecessary(this, new PermissionsResultAction() {
            @Override
            public void onGranted() {

            }

            @Override
            public void onDenied(String permission) {

            }
        });
```

