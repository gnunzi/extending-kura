# Extending Kura
Eclipse Kura is a powerful IoT framework. If you want to add your own functionalities, there is a steep learning curve that might refrain from the adoption of Kura in your project.

With this repo, you can develop your first Kura Components within one minute:
* **Use Java annotations from OSGi**. You don't need to write the Bundle Manifest or the OSGi XML documents. Just concentrate on Java.
* **Use Maven to resolve dependencies**. You don't need to manually download any library. Just concentrate on your own code.
* **Use the Kura Docker container**. You don't need to compile the Kura source code. `docker-compose up` is all you need. BTW Maven copied your bundles in the mount point already!
* **Use MS VSCode or your favourite IDE**. Write code, compile with maven, test with docker.

## Quickstart
The best way to try  this repo is using a Github Codespace:
1. Fork this repo
2. Go to your repo and start a new Codespace
3. Type `mvn verify`
4. Type `docker-compose --file docker/docker-compose.yml build`
5. You will see a pop-up asking you if you to want to open the web page.
6. Open the web page. Username / password from Kura: admin / admin .

## Compile your code
Type the following:
```
mvn verify
```
Maven will copy in the _verify_ phase your bundles into the directory `bundles_from_all_modules`.

## Build Docker Image
Type the following:
```
docker-compose --file docker/docker-compose.yml build
```
The directory `bundles_from_all_modules` will be mounted in the container as `/load`. Apache Felix will dynamically load all bundles in the `/load` directory. Your Kura Components will appear in the Kura Admin UI.

## Guides
Some guides on Java annotations, OSGi, Maven and Docker are in the [Wiki](https://github.com/gnunzi/extending-kura/wiki)https://github.com/gnunzi/extending-kura/wiki.

