# Google Cloud Key Management Service Client for Java

Java idiomatic client for [Cloud Key Management Service][product-docs].

[![Maven][maven-version-image]][maven-version-link]
![Stability][stability-image]

- [Product Documentation][product-docs]
- [Client Library Documentation][javadocs]


## Quickstart

If you are using Maven with [BOM][libraries-bom], add this to your pom.xml file

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      <artifactId>libraries-bom</artifactId>
      <version>24.1.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.cloud</groupId>
    <artifactId>google-cloud-kms</artifactId>
  </dependency>
</dependencies>

```

If you are using Maven without BOM, add this to your dependencies:


```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloud-kms</artifactId>
  <version>2.3.1</version>
</dependency>

```

If you are using Gradle 5.x or later, add this to your dependencies

```Groovy
implementation platform('com.google.cloud:libraries-bom:24.2.0')

implementation 'com.google.cloud:google-cloud-kms'
```
If you are using Gradle without BOM, add this to your dependencies

```Groovy
implementation 'com.google.cloud:google-cloud-kms:2.3.1'
```

If you are using SBT, add this to your dependencies

```Scala
libraryDependencies += "com.google.cloud" % "google-cloud-kms" % "2.3.1"
```

## Authentication

See the [Authentication][authentication] section in the base directory's README.

## Authorization

The client application making API calls must be granted [authorization scopes][auth-scopes] required for the desired Cloud Key Management Service APIs, and the authenticated principal must have the [IAM role(s)][predefined-iam-roles] required to access GCP resources using the Cloud Key Management Service API calls.

## Getting Started

### Prerequisites

You will need a [Google Cloud Platform Console][developer-console] project with the Cloud Key Management Service [API enabled][enable-api].
You will need to [enable billing][enable-billing] to use Google Cloud Key Management Service.
[Follow these instructions][create-project] to get your project set up. You will also need to set up the local development environment by
[installing the Google Cloud SDK][cloud-sdk] and running the following commands in command line:
`gcloud auth login` and `gcloud config set project [YOUR PROJECT ID]`.

### Installation and setup

You'll need to obtain the `google-cloud-kms` library.  See the [Quickstart](#quickstart) section
to add `google-cloud-kms` as a dependency in your code.

## About Cloud Key Management Service


[Cloud Key Management Service][product-docs] a cloud-hosted key management service that lets you manage cryptographic keys for your cloud services the same way you do on-premises. You can generate, use, rotate, and destroy AES256, RSA 2048, RSA 3072, RSA 4096, EC P256, and EC P384 cryptographic keys. Cloud KMS is integrated with Cloud IAM and Cloud Audit Logging so that you can manage permissions on individual keys and monitor how these are used. Use Cloud KMS to protect secrets and other sensitive data that you need to store in Google Cloud Platform.

See the [Cloud Key Management Service client library docs][javadocs] to learn how to
use this Cloud Key Management Service Client Library.





## Samples

Samples are in the [`samples/`](https://github.com/googleapis/java-kms/tree/main/samples) directory.

| Sample                      | Source Code                       | Try it |
| --------------------------- | --------------------------------- | ------ |
| Create Key Asymmetric Decrypt | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyAsymmetricDecrypt.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyAsymmetricDecrypt.java) |
| Create Key Asymmetric Sign | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyAsymmetricSign.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyAsymmetricSign.java) |
| Create Key Hsm | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyHsm.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyHsm.java) |
| Create Key Labels | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyLabels.java) |
| Create Key Mac | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyMac.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyMac.java) |
| Create Key Ring | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyRing.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyRing.java) |
| Create Key Rotation Schedule | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyRotationSchedule.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyRotationSchedule.java) |
| Create Key Symmetric Encrypt Decrypt | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeySymmetricEncryptDecrypt.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeySymmetricEncryptDecrypt.java) |
| Create Key Version | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/CreateKeyVersion.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/CreateKeyVersion.java) |
| Decrypt Asymmetric | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/DecryptAsymmetric.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/DecryptAsymmetric.java) |
| Decrypt Symmetric | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/DecryptSymmetric.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/DecryptSymmetric.java) |
| Destroy Key Version | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/DestroyKeyVersion.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/DestroyKeyVersion.java) |
| Disable Key Version | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/DisableKeyVersion.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/DisableKeyVersion.java) |
| Enable Key Version | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/EnableKeyVersion.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/EnableKeyVersion.java) |
| Encrypt Asymmetric | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/EncryptAsymmetric.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/EncryptAsymmetric.java) |
| Encrypt Symmetric | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/EncryptSymmetric.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/EncryptSymmetric.java) |
| Generate Random Bytes | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/GenerateRandomBytes.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/GenerateRandomBytes.java) |
| Get Key Labels | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/GetKeyLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/GetKeyLabels.java) |
| Get Key Version Attestation | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/GetKeyVersionAttestation.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/GetKeyVersionAttestation.java) |
| Get Public Key | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/GetPublicKey.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/GetPublicKey.java) |
| Iam Add Member | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/IamAddMember.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/IamAddMember.java) |
| Iam Get Policy | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/IamGetPolicy.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/IamGetPolicy.java) |
| Iam Remove Member | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/IamRemoveMember.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/IamRemoveMember.java) |
| Quickstart | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/Quickstart.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/Quickstart.java) |
| Restore Key Version | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/RestoreKeyVersion.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/RestoreKeyVersion.java) |
| Sign Asymmetric | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/SignAsymmetric.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/SignAsymmetric.java) |
| Sign Mac | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/SignMac.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/SignMac.java) |
| Update Key Add Rotation | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/UpdateKeyAddRotation.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/UpdateKeyAddRotation.java) |
| Update Key Remove Labels | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/UpdateKeyRemoveLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/UpdateKeyRemoveLabels.java) |
| Update Key Remove Rotation | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/UpdateKeyRemoveRotation.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/UpdateKeyRemoveRotation.java) |
| Update Key Set Primary | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/UpdateKeySetPrimary.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/UpdateKeySetPrimary.java) |
| Update Key Update Labels | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/UpdateKeyUpdateLabels.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/UpdateKeyUpdateLabels.java) |
| Verify Asymmetric Ec | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/VerifyAsymmetricEc.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/VerifyAsymmetricEc.java) |
| Verify Asymmetric Rsa | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/VerifyAsymmetricRsa.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/VerifyAsymmetricRsa.java) |
| Verify Mac | [source code](https://github.com/googleapis/java-kms/blob/main/samples/snippets/src/main/java/kms/VerifyMac.java) | [![Open in Cloud Shell][shell_img]](https://console.cloud.google.com/cloudshell/open?git_repo=https://github.com/googleapis/java-kms&page=editor&open_in_editor=samples/snippets/src/main/java/kms/VerifyMac.java) |



## Troubleshooting

To get help, follow the instructions in the [shared Troubleshooting document][troubleshooting].

## Transport

Cloud Key Management Service uses gRPC for the transport layer.

## Supported Java Versions

Java 8 or above is required for using this client.

Google's Java client libraries,
[Google Cloud Client Libraries][cloudlibs]
and
[Google Cloud API Libraries][apilibs],
follow the
[Oracle Java SE support roadmap][oracle]
(see the Oracle Java SE Product Releases section).

### For new development

In general, new feature development occurs with support for the lowest Java
LTS version covered by  Oracle's Premier Support (which typically lasts 5 years
from initial General Availability). If the minimum required JVM for a given
library is changed, it is accompanied by a [semver][semver] major release.

Java 11 and (in September 2021) Java 17 are the best choices for new
development.

### Keeping production systems current

Google tests its client libraries with all current LTS versions covered by
Oracle's Extended Support (which typically lasts 8 years from initial
General Availability).

#### Legacy support

Google's client libraries support legacy versions of Java runtimes with long
term stable libraries that don't receive feature updates on a best efforts basis
as it may not be possible to backport all patches.

Google provides updates on a best efforts basis to apps that continue to use
Java 7, though apps might need to upgrade to current versions of the library
that supports their JVM.

#### Where to find specific information

The latest versions and the supported Java versions are identified on
the individual GitHub repository `github.com/GoogleAPIs/java-SERVICENAME`
and on [google-cloud-java][g-c-j].

## Versioning


This library follows [Semantic Versioning](http://semver.org/).



## Contributing


Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING][contributing] for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct][code-of-conduct] for more
information.


## License

Apache 2.0 - See [LICENSE][license] for more information.

## CI Status

Java Version | Status
------------ | ------
Java 8 | [![Kokoro CI][kokoro-badge-image-2]][kokoro-badge-link-2]
Java 8 OSX | [![Kokoro CI][kokoro-badge-image-3]][kokoro-badge-link-3]
Java 8 Windows | [![Kokoro CI][kokoro-badge-image-4]][kokoro-badge-link-4]
Java 11 | [![Kokoro CI][kokoro-badge-image-5]][kokoro-badge-link-5]

Java is a registered trademark of Oracle and/or its affiliates.

[product-docs]: https://cloud.google.com/kms
[javadocs]: https://cloud.google.com/java/docs/reference/google-cloud-kms/latest/history
[kokoro-badge-image-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java7.svg
[kokoro-badge-link-1]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java7.html
[kokoro-badge-image-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8.svg
[kokoro-badge-link-2]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8.html
[kokoro-badge-image-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8-osx.svg
[kokoro-badge-link-3]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8-osx.html
[kokoro-badge-image-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8-win.svg
[kokoro-badge-link-4]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java8-win.html
[kokoro-badge-image-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java11.svg
[kokoro-badge-link-5]: http://storage.googleapis.com/cloud-devrel-public/java/badges/java-kms/java11.html
[stability-image]: https://img.shields.io/badge/stability-stable-green
[maven-version-image]: https://img.shields.io/maven-central/v/com.google.cloud/google-cloud-kms.svg
[maven-version-link]: https://search.maven.org/search?q=g:com.google.cloud%20AND%20a:google-cloud-kms&core=gav
[authentication]: https://github.com/googleapis/google-cloud-java#authentication
[auth-scopes]: https://developers.google.com/identity/protocols/oauth2/scopes
[predefined-iam-roles]: https://cloud.google.com/iam/docs/understanding-roles#predefined_roles
[iam-policy]: https://cloud.google.com/iam/docs/overview#cloud-iam-policy
[developer-console]: https://console.developers.google.com/
[create-project]: https://cloud.google.com/resource-manager/docs/creating-managing-projects
[cloud-sdk]: https://cloud.google.com/sdk/
[troubleshooting]: https://github.com/googleapis/google-cloud-common/blob/main/troubleshooting/readme.md#troubleshooting
[contributing]: https://github.com/googleapis/java-kms/blob/main/CONTRIBUTING.md
[code-of-conduct]: https://github.com/googleapis/java-kms/blob/main/CODE_OF_CONDUCT.md#contributor-code-of-conduct
[license]: https://github.com/googleapis/java-kms/blob/main/LICENSE
[enable-billing]: https://cloud.google.com/apis/docs/getting-started#enabling_billing
[enable-api]: https://console.cloud.google.com/flows/enableapi?apiid=cloudkms.googleapis.com
[libraries-bom]: https://github.com/GoogleCloudPlatform/cloud-opensource-java/wiki/The-Google-Cloud-Platform-Libraries-BOM
[shell_img]: https://gstatic.com/cloudssh/images/open-btn.png

[semver]: https://semver.org/
[cloudlibs]: https://cloud.google.com/apis/docs/client-libraries-explained
[apilibs]: https://cloud.google.com/apis/docs/client-libraries-explained#google_api_client_libraries
[oracle]: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
[g-c-j]: http://github.com/googleapis/google-cloud-java
