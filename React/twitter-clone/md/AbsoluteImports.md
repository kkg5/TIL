# Absolute Imports

[ [Absolute Imports docs ink](https://create-react-app.dev/docs/importing-a-component) ]

최상위 폴더에 `jsconfig.json` 을 작성해주면 아래처럼 깔끔하게 import 가능

- jsoconfig.json

    ```json
    {
      "compilerOptions": {
        "baseUrl": "src"
      },
      "include": ["src"]
    }
    ```

```jsx
import Button from 'components/Button';
```
