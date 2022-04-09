# Firebase Auth

[ [getAuth docs link](https://firebase.google.com/docs/reference/js/auth?authuser=0#getauth) ]

[ [Auth.currentUser docs link](https://firebase.google.com/docs/reference/js/auth.auth?authuser=0#authcurrentuser) ]

return 값이 User이면 로그인, null이면 로그아웃 된 상태

```jsx
import { getAuth } from "firebase/auth";

getAuth().currentUser; // return User or null
```

[ [createUserWithEmailAndPassword docs link](https://firebase.google.com/docs/reference/js/auth.md?authuser=0#createuserwithemailandpassword) ]

[ [Persistence interface docs link](https://firebase.google.com/docs/reference/js/auth.persistence.md?authuser=0#properties)]