
package com.dinstone.jrpc.proxy;

public interface ServiceProxyFactory {

    public <T> T createProxy(Class<T> si, String group);

    public void destroy();
}
