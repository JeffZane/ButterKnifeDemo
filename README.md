# ButterKnifeDemo
This is a demo about ButterKnife version-8.2.1.

The newest ButterKnife support Library uses. This demo contains App module uses and library uses.

__Library uses:__

step1
---------
add butterknife.gradle to root project and add「apply from: "../../ButterKnifeDemo/butterknife.gradle"」 in your library gradle file.

step2
---------
According to documention, use R2 instead of R inside all Butter Knife annotations.

```java
class ExampleActivity extends Activity {
  @BindView(R2.id.user) EditText username;
  @BindView(R2.id.pass) EditText password;
...
}
```
