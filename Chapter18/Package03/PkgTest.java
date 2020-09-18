package Chapter18.Package03;

// Продемонстрировать применение класса Package

class PkgTest {
    public static void main(String[] args) {
        Package[] pkgs = Package.getPackages();
        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(pkgs[i].getName() + " "
                             + pkgs[i].getImplementationTitle() + " "
                             + pkgs[i].getImplementationVendor() + " "
                             + pkgs[i].getImplementationVersion());
        }
    }
}
/* -----------------------------------------
jdk.internal.ref null null null
java.net null null null
java.nio.file.spi null null null
java.nio.charset null null null
jdk.internal.util.jar null null null
sun.util.locale null null null
sun.net.util null null null
java.lang.invoke null null null
java.nio.charset.spi null null null
java.nio null null null
sun.net.www.protocol.jar null null null
java.util.jar null null null
java.util.concurrent.locks null null null
jdk.internal.org.objectweb.asm null null null
sun.reflect.annotation null null null
sun.util null null null
java.nio.file.attribute null null null
sun.nio null null null
java.lang.instrument null null null
sun.security.action null null null
java.lang.annotation null null null
sun.invoke.util null null null
sun.nio.fs null null null
sun.invoke.empty null null null
jdk.internal.misc null null null
sun.nio.ch null null null
sun.net null null null
java.security null null null
java.lang.module null null null
sun.net.www null null null
java.util.concurrent null null null
sun.security.util null null null
sun.instrument null null null
java.util.zip null null null
java.lang.ref null null null
jdk.internal.perf null null null
jdk.internal.module null null null
java.lang.reflect null null null
java.util.stream null null null
sun.nio.cs null null null
sun.io null null null
java.io null null null
sun.launcher null null null
java.nio.file null null null
sun.net.spi null null null
jdk.internal.reflect null null null
jdk.internal.loader null null null
java.security.cert null null null
java.lang null null null
sun.net.www.protocol.jrt null null null
sun.net.www.protocol.file null null null
java.util.function null null null
java.util.concurrent.atomic null null null
jdk.internal.util null null null
java.util null null null
com.intellij.rt.execution.application null null null
Chapter18.Package03 null null null

 */