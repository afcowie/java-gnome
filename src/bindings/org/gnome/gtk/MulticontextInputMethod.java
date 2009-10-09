/*
 * MulticontextInputMethod.java
 *
 * Copyright (c) 2007-2009 Operational Dynamics Consulting Pty Ltd
 *
 * The code in this file, and the library it is a part of, are made available
 * to you by the authors under the terms of the "GNU General Public Licence,
 * version 2" plus the "Classpath Exception" (you may link to this code as a
 * library into other programs provided you don't make a derivation of it).
 * See the LICENCE file for the terms governing usage and redistribution.
 */
package org.gnome.gtk;

/*
 * FIXME this is a placeholder stub for what will become the public API for
 * this type. Replace this comment with appropriate javadoc including author
 * and since tags. Note that the class may need to be made abstract, implement
 * interfaces, or even have its parent changed. No API stability guarantees
 * are made about this class until it has been reviewed by a hacker and this
 * comment has been replaced.
 */
/**
 * A dynamic input method that enables the user to switch between input
 * methods.
 * 
 * <p>
 * Apparently you should use this in preference to "simple", although if using
 * this without having specified a different input method you'll get GTK's
 * default which seems to be a (the?) SimpleInputMethod.
 * 
 * @author Andrew Cowie
 * @since 4.0.14
 */
public class MulticontextInputMethod extends InputMethod
{
    protected MulticontextInputMethod(long pointer) {
        super(pointer);
    }

    /**
     * Create an input method.
     * 
     * @since 4.0.14
     */
    public MulticontextInputMethod() {
        super(GtkIMMulticontext.createMulticontextInputMethod());
    }
}