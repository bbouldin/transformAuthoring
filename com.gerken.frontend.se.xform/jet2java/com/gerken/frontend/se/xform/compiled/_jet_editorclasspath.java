package com.gerken.frontend.se.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_editorclasspath implements JET2Template {

    public _jet_editorclasspath() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<classpath>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"src\" path=\"src\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<classpathentry kind=\"output\" path=\"bin\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</classpath>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
