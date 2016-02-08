# Java Typescript Interface

Typescript provides the a service called LanguageService who provides editors access to advanced features like:

* Outline
* Auto-complete
* Error Diagnostic
* ...

This project provides Java-APIs to access the language service inside your Java application

# Usage

## OSGi

TODO p2 repo

```java
BundleContext bctx = FrameworkUtil.getBundle(getClass()).getBundleContext();

ServiceReference<TSServerFactory> reference = bctx.getServiceReference(TSServerFactory.class);

TSServerFactory tsServiceFactory = bctx.getService(reference);
TSServer server = tsServiceFactory.getServer(UUID.randomUUID().toString());

LanguageService service = server.getService(LanguageService.class);
```

## Plain Java

TODO m2 repo

```java
TSServerFactory tsServiceFactory = ServiceLoader.load(TSServerFactory.class);
TSServer server = tsServiceFactory.getServer(UUID.randomUUID().toString());

LanguageService service = server.getService(LanguageService.class);
```
