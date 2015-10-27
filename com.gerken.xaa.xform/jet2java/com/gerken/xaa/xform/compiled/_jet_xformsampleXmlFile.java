package com.gerken.xaa.xform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_xformsampleXmlFile implements JET2Template {
    private static final String _jetns_c1 = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_xformsampleXmlFile() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c1_setVariable_1_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$xform/group[@root='true']", //$NON-NLS-1$
                "current", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_set_2_1 = new TagInfo("c1:set", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$current", //$NON-NLS-1$
                "indent", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_setVariable_3_1 = new TagInfo("c1:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                " '    ' ", //$NON-NLS-1$
                "tab", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c1_include_4_1 = new TagInfo("c1:include", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/recurse/sampleXmlFile.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c1_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_1_1.setRuntimeParent(null);
        _jettag_c1_setVariable_1_1.setTagInfo(_td_c1_setVariable_1_1);
        _jettag_c1_setVariable_1_1.doStart(context, out);
        _jettag_c1_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c1_set_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "set", "c1:set", _td_c1_set_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_set_2_1.setRuntimeParent(null);
        _jettag_c1_set_2_1.setTagInfo(_td_c1_set_2_1);
        _jettag_c1_set_2_1.doStart(context, out);
        JET2Writer _jettag_c1_set_2_1_saved_out = out;
        while (_jettag_c1_set_2_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            _jettag_c1_set_2_1.handleBodyContent(out);
        }
        out = _jettag_c1_set_2_1_saved_out;
        _jettag_c1_set_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c1_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "setVariable", "c1:setVariable", _td_c1_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_setVariable_3_1.setRuntimeParent(null);
        _jettag_c1_setVariable_3_1.setTagInfo(_td_c1_setVariable_3_1);
        _jettag_c1_setVariable_3_1.doStart(context, out);
        _jettag_c1_setVariable_3_1.doEnd();
        RuntimeTagElement _jettag_c1_include_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c1, "include", "c1:include", _td_c1_include_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c1_include_4_1.setRuntimeParent(null);
        _jettag_c1_include_4_1.setTagInfo(_td_c1_include_4_1);
        _jettag_c1_include_4_1.doStart(context, out);
        _jettag_c1_include_4_1.doEnd();
    }
}
