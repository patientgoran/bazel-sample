## Instructions

> While browsing this repo, these are the only files pertinent to Bazel:
> - `WORKSPACE`
> - `.bazelrc`
> - Multiple `BUILD` files in subdirectories

1. Install **bazelisk**: `brew install bazelisk`
    -  `bazelisk` is a thin wrapper around bazel making sure you always use the latest version, or the one specified in config (if any) 
2. Install bazel plugin in **IJ** from marketplace (easy to find)
3. Clone this repo
4. In **IJ**, choose meny item `File->Import Bazel Project` and choose **this** directory
5. Choose `Create from scratch` in the next step

Now you are able to build project.

### Build/Test from command line

Usage examples: 
```
$ bazelisk build ...
$ bazelisk test ...
$ bazelisk test //apps/sampleapp/...
$ bazelisk build //libs/samplelib:samplelib
```


- The three dots mean everything found from here downbelow
- You might also want to read about `bazelisk query` command for more options


### Build/Test in IJ 

- **Build**: just right click on a (sub-) directory in your repo and choose a meny item saying **Partially Sync ...**
- **Test**: right click on a test class and choose `Debug Bazel test <MyClass>`

### CI/CD

Bazel implements targets for building (and pushing) Docker images, so a lot of CI/CD could be done from Bazel.

Examples:
```
java_image {
  name = "my-image",
  base = "...",
}

container_push(
    name = "image-push",
    format = "Docker",
    image = ":my-image",
    registry = "index.docker.io",
    repository = "<username>/cmd-api",
)
```

and then

`bazel run :image-push`

IMO the previous command should trigger the image deployment in the test env.

Tagging image for production should roll it out.

