Ok, i give up, i use ** to match the branchs

Maybe we need to use this: origin/pr/${ghprbPullId}/merge

we need a read me.

why as bellow when use ${sha1}:

Error while serving http://10.239.44.7:8080/job/jenkins%20PR%20github%20test/buildHistory/ajax
java.lang.reflect.InvocationTargetException
	at sun.reflect.GeneratedMethodAccessor166.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.kohsuke.stapler.Function$InstanceFunction.invoke(Function.java:297)
	at org.kohsuke.stapler.Function.bindAndInvoke(Function.java:160)
	at org.kohsuke.stapler.Function.bindAndInvokeAndServeResponse(Function.java:95)
	at org.kohsuke.stapler.MetaClass$1.doDispatch(MetaClass.java:120)
	at org.kohsuke.stapler.NameBasedDispatcher.dispatch(NameBasedDispatcher.java:53)
	at org.kohsuke.stapler.Stapler.tryInvoke(Stapler.java:727)
	at org.kohsuke.stapler.Stapler.invoke(Stapler.java:841)
	at org.kohsuke.stapler.MetaClass$12.dispatch(MetaClass.java:390)
	at org.kohsuke.stapler.Stapler.tryInvoke(Stapler.java:727)
	at org.kohsuke.stapler.Stapler.invoke(Stapler.java:841)
	at org.kohsuke.stapler.MetaClass$6.doDispatch(MetaClass.java:248)
	at org.kohsuke.stapler.NameBasedDispatcher.dispatch(NameBasedDispatcher.java:53)
	at org.kohsuke.stapler.Stapler.tryInvoke(Stapler.java:727)
	at org.kohsuke.stapler.Stapler.invoke(Stapler.java:841)
	at org.kohsuke.stapler.Stapler.invoke(Stapler.java:630)
	at org.kohsuke.stapler.Stapler.service(Stapler.java:224)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:848)
	at org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:686)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1494)
	at hudson.util.PluginServletFilter$1.doFilter(PluginServletFilter.java:96)
	at hudson.util.PluginServletFilter.doFilter(PluginServletFilter.java:88)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1482)
	at hudson.security.csrf.CrumbFilter.doFilter(CrumbFilter.java:48)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1482)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:84)
	at hudson.security.UnwrapSecurityExceptionFilter.doFilter(UnwrapSecurityExceptionFilter.java:51)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at jenkins.security.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:117)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at org.acegisecurity.providers.anonymous.AnonymousProcessingFilter.doFilter(AnonymousProcessingFilter.java:125)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at org.acegisecurity.ui.rememberme.RememberMeProcessingFilter.doFilter(RememberMeProcessingFilter.java:142)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at org.acegisecurity.ui.AbstractProcessingFilter.doFilter(AbstractProcessingFilter.java:271)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at org.acegisecurity.ui.basicauth.BasicProcessingFilter.doFilter(BasicProcessingFilter.java:174)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at jenkins.security.ApiTokenFilter.doFilter(ApiTokenFilter.java:64)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at org.acegisecurity.context.HttpSessionContextIntegrationFilter.doFilter(HttpSessionContextIntegrationFilter.java:249)
	at hudson.security.HttpSessionContextIntegrationFilter2.doFilter(HttpSessionContextIntegrationFilter2.java:67)
	at hudson.security.ChainedServletFilter$1.doFilter(ChainedServletFilter.java:87)
	at hudson.security.ChainedServletFilter.doFilter(ChainedServletFilter.java:76)
	at hudson.security.HudsonFilter.doFilter(HudsonFilter.java:164)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1482)
	at org.kohsuke.stapler.compression.CompressionFilter.doFilter(CompressionFilter.java:46)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1482)
	at hudson.util.CharacterEncodingFilter.doFilter(CharacterEncodingFilter.java:81)
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1474)
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:499)
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:137)
	at org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:533)
	at org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:231)
	at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1086)
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:428)
	at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:193)
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1020)
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:135)
	at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:116)
	at org.eclipse.jetty.server.Server.handle(Server.java:370)
	at org.eclipse.jetty.server.AbstractHttpConnection.handleRequest(AbstractHttpConnection.java:489)
	at org.eclipse.jetty.server.AbstractHttpConnection.headerComplete(AbstractHttpConnection.java:949)
	at org.eclipse.jetty.server.AbstractHttpConnection$RequestHandler.headerComplete(AbstractHttpConnection.java:1011)
	at org.eclipse.jetty.http.HttpParser.parseNext(HttpParser.java:644)
	at org.eclipse.jetty.http.HttpParser.parseAvailable(HttpParser.java:235)
	at org.eclipse.jetty.server.AsyncHttpConnection.handle(AsyncHttpConnection.java:82)
	at org.eclipse.jetty.io.nio.SelectChannelEndPoint.handle(SelectChannelEndPoint.java:668)
	at org.eclipse.jetty.io.nio.SelectChannelEndPoint$1.run(SelectChannelEndPoint.java:52)
	at winstone.BoundedExecutorService$1.run(BoundedExecutorService.java:77)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:724)
Caused by: org.eclipse.jetty.io.EofException
	at org.eclipse.jetty.http.HttpGenerator.flushBuffer(HttpGenerator.java:914)
	at org.eclipse.jetty.http.HttpGenerator.complete(HttpGenerator.java:798)
	at org.eclipse.jetty.server.AbstractHttpConnection.commitResponse(AbstractHttpConnection.java:628)
	at org.eclipse.jetty.server.AbstractHttpConnection$Output.close(AbstractHttpConnection.java:1084)
	at com.jcraft.jzlib.DeflaterOutputStream.close(DeflaterOutputStream.java:122)
	at org.kohsuke.stapler.compression.FilterServletOutputStream.close(FilterServletOutputStream.java:36)
	at java.io.FilterOutputStream.close(FilterOutputStream.java:160)
	at sun.nio.cs.StreamEncoder.implClose(StreamEncoder.java:320)
	at sun.nio.cs.StreamEncoder.close(StreamEncoder.java:149)
	at java.io.OutputStreamWriter.close(OutputStreamWriter.java:233)
	at java.io.BufferedWriter.close(BufferedWriter.java:266)
	at org.dom4j.io.XMLWriter.close(XMLWriter.java:286)
	at org.kohsuke.stapler.jelly.HTMLWriterOutput.close(HTMLWriterOutput.java:70)
	at org.kohsuke.stapler.jelly.DefaultScriptInvoker.invokeScript(DefaultScriptInvoker.java:56)
	at org.kohsuke.stapler.jelly.JellyRequestDispatcher.forward(JellyRequestDispatcher.java:55)
	at hudson.widgets.HistoryWidget.doAjax(HistoryWidget.java:195)
	... 75 more
Caused by: java.nio.channels.ClosedChannelException
	at sun.nio.ch.SocketChannelImpl.ensureWriteOpen(SocketChannelImpl.java:267)
	at sun.nio.ch.SocketChannelImpl.write(SocketChannelImpl.java:489)
	at java.nio.channels.SocketChannel.write(SocketChannel.java:493)
	at org.eclipse.jetty.io.nio.ChannelEndPoint.gatheringFlush(ChannelEndPoint.java:376)
	at org.eclipse.jetty.io.nio.ChannelEndPoint.flush(ChannelEndPoint.java:335)
	at org.eclipse.jetty.io.nio.SelectChannelEndPoint.flush(SelectChannelEndPoint.java:376)
	at org.eclipse.jetty.http.HttpGenerator.flushBuffer(HttpGenerator.java:838)
	... 90 more
