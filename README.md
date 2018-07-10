Idea Plugin Get Current Editor Title and Content Demo
=====================================================

Run plugin in IDEA:

```
./gradlew runIde
```

And open a text file, then click on the menu `Sample Menu` -> `Popup`, it will show a dialog about the title and content of current document.

Build the plugin to a zip:

```
./gradlew buildPlugin
```

It will generate the plugin file in `./build/distributions`

Notice
-------

- Use `version 'IC-2018.1.5'` every time to reduce download. (about 500M)
- Don't forget to change `id` and `name` in `resources/META-INF/plugin.xml` to current project