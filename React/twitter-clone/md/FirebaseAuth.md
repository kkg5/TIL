# Firebase Auth

## currentUser

[ [getAuth docs link](https://firebase.google.com/docs/reference/js/auth?authuser=0#getauth) ]

[ [Auth.currentUser docs link](https://firebase.google.com/docs/reference/js/auth.auth?authuser=0#authcurrentuser) ]

return 값이 User이면 로그인, null이면 로그아웃 된 상태

```jsx
import { getAuth } from "firebase/auth";

getAuth().currentUser; // return User or null
```

---

## WithEmailAndPassword

[ [createUserWithEmailAndPassword docs link](https://firebase.google.com/docs/reference/js/auth.md?authuser=0#createuserwithemailandpassword) ]

[ [signInWithEmailAndPassword docs link](https://firebase.google.com/docs/reference/js/auth.md?authuser=0#signinwithemailandpassword) ]

```jsx
import { getAuth } from "firebase/auth";

createUserWithEmailAndPassword(getAuth(), email, password);
// 파라미터: auth: Auth, email: string, password: string
// 반환값: Promise<UserCredential>;

signInWithEmailAndPassword(getAuth(), email, password);
// 파라미터: auth: Auth, email: string, password: string
// 반환값: Promise<UserCredential>;
```

---

## Persistence

[ [setPersistence docs link](https://firebase.google.com/docs/reference/js/auth.md?authuser=0#setpersistence) ]

[ [Persistence interface docs link](https://firebase.google.com/docs/reference/js/auth.persistence.md?authuser=0#properties) ]

```jsx
setPersistence();
// 파라미터: auth: Auth, persistence: Persistence
// 반환값: Promise<void>
```

### Type of Persistence

- React Native App과 앱 브라우저의 초기값은 `LOCAL`
- `SESSION`: 탭이 열려있는 동안 사용자 정보 기억
- `LOCAL`: 브라우저를 닫더라도 사용자 정보 기억
- `NONE`: 기억하지 않음

---

## onAuthStateChanged

[ [onAuthStateChanged docs link](https://firebase.google.com/docs/reference/js/auth.md?authuser=0#onauthstatechanged) ]

```jsx
const authService = getAuth()
const [isLoggedIn, setIsLoggedIn] = useState(authService.currentUser);
useEffect(() => {
    onAuthStateChanged(authService, (user) => setIsLoggedIn(user));
  }, []);
// 파라미터:
//   auth: Auth,
//   nextOrObserver: NextOrObserver<User>,
//   error?: ErrorFn,
//   completed?: CompleteFn
// 반환값: Unsubscribe
```
