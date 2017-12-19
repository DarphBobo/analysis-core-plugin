package io.jenkins.plugins.analysis.core.model;

import org.kohsuke.stapler.DataBoundConstructor;

import edu.hm.hafner.analysis.Issues;
import edu.hm.hafner.analysis.Issues.IssueFilterBuilder;

import hudson.Extension;

/**
 * Defines a filter criteria for {@link Issues}.
 *
 * @author Ulli Hafner
 */
public class IncludeCategory extends IncludeFilter {
    /**
     * Creates a new instance of {@link IncludeCategory}.
     *
     * @param name
     *            the regular expression of the filter
     */
    @DataBoundConstructor
    public IncludeCategory(final String name) {
        super(name);
    }

    @Override
    public void apply(final IssueFilterBuilder builder, final String regexp) {
        builder.setIncludeCategoryFilter(regexp);
    }

    /**
     * Dummy descriptor for {@link IncludeCategory}.
     *
     * @author Ulli Hafner
     */
   @Extension
   public static class DescriptorImpl extends IncludeFilterDescriptor {
        // Required for Jenkins
   }
}