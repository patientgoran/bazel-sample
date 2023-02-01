load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

java_binary(
    name = "sampleapp2",
    main_class = "com.example.myproject.App",
    runtime_deps = [":lib"],
    visibility = ["//visibility:public"],
)

java_library(
    name = "lib",
    srcs = glob(["src/main/java/com/example/myproject/*.java"]),
    deps = [
        "@maven//:com_google_guava_guava",
        "//libs/samplelib"
    ],
    visibility = ["//visibility:private"],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    test_class = "com.example.myproject.TestApp2",
    deps = [
        ":lib",
        "@maven//:junit_junit",
    ],
    visibility = ["//visibility:private"],
)

