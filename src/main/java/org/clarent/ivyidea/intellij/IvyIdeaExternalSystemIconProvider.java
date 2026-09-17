package org.clarent.ivyidea.intellij;

import com.intellij.openapi.externalSystem.ui.ExternalSystemIconProvider;
import org.clarent.ivyidea.intellij.ui.IvyIdeaIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class IvyIdeaExternalSystemIconProvider implements ExternalSystemIconProvider {
    @NotNull
    @Override
    public Icon getReloadIcon() {
        return IvyIdeaIcons.MAIN_ICON_SMALL != null
                ? IvyIdeaIcons.MAIN_ICON_SMALL
                : ExternalSystemIconProvider.super.getReloadIcon();
    }
}
