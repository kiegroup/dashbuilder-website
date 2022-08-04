package org.dashbuilder.client.navigation.resources.i18n;

public class NavigationConstants_ implements org.dashbuilder.client.navigation.resources.i18n.NavigationConstants {
  
  public java.lang.String newItem(java.lang.String arg0) {
    return "+ New " + arg0;
  }
  
  public java.lang.String newItemName(java.lang.String arg0) {
    return "- New " + arg0 + " -";
  }
  
  public java.lang.String itemMenuTitle() {
    return "Show menu";
  }
  
  public java.lang.String editItem() {
    return "Edit";
  }
  
  public java.lang.String deleteItem() {
    return "Delete";
  }
  
  public java.lang.String pageIconTitle() {
    return "A user created page";
  }
  
  public java.lang.String perspectiveIconTitle() {
    return "A hard-coded static perspective";
  }
  
  public java.lang.String moveUp() {
    return "Move up";
  }
  
  public java.lang.String moveDown() {
    return "Move down";
  }
  
  public java.lang.String moveFirst() {
    return "Move first";
  }
  
  public java.lang.String moveLast() {
    return "Move last";
  }
  
  public java.lang.String gotoItem(java.lang.String arg0) {
    return "Goto " + arg0;
  }
  
  public java.lang.String saveChanges() {
    return "Save changes?";
  }
  
  public java.lang.String save() {
    return "Save";
  }
  
  public java.lang.String cancel() {
    return "Cancel";
  }
  
  public java.lang.String navMenubarDragComponent() {
    return "Menu Bar";
  }
  
  public java.lang.String navTabListDragComponent() {
    return "Tab List";
  }
  
  public java.lang.String navTreeDragComponent() {
    return "Tree";
  }
  
  public java.lang.String navTilesDragComponent() {
    return "Tile Navigator";
  }
  
  public java.lang.String navCarouselDragComponent() {
    return "Carousel";
  }
  
  public java.lang.String navMenubarDragComponentNavGroupHelp() {
    return "The menu bar will display items from the navigation group you select.";
  }
  
  public java.lang.String navTabListDragComponentNavGroupHelp() {
    return "The navigation group you select is used to retrieve a list of pages, which are displayed in the form of tabs - one page per tab.";
  }
  
  public java.lang.String navTreeDragComponentNavGroupHelp() {
    return "The tree component will display iems from the navigation group you select.";
  }
  
  public java.lang.String navTilesDragComponentNavGroupHelp() {
    return "The tile navigator will display items from the navigation group you select. Groups are displayed as folders whereas single items show its content once clicked.";
  }
  
  public java.lang.String navCarouselDragComponentNavGroupHelp() {
    return "The navigation group you select is used to retrieve a list of pages, which are displayed as an slideshow carousel - one page per slide.";
  }
  
  public java.lang.String navGroupEmptyError() {
    return "Please, make sure the group configured is not empty.";
  }
  
  public java.lang.String navCarouselDragComponentEmptyError() {
    return "Please, make sure the group configured contains at least one user created page.";
  }
  
  public java.lang.String navTilesDragComponentInfiniteRecursion() {
    return "The content is not displayed to avoid an infinite loop. In general the pages in the navigation group you selected for this component must not contain navigation components which refer (directly nor indirectly) to the pages in that same group. Please double check the configuration of both the navigation tree and the navigation components. Reason:";
  }
  
  public java.lang.String navCarouselDragComponentInfiniteRecursion() {
    return "This carousel slide is not displayed to avoid an infinite loop. In general the pages in the navigation group you selected for this component must not contain navigation components which refer (directly nor indirectly) to the pages in that same group. Please double check the configuration of both the navigation tree and the navigation components. Reason:";
  }
  
  public java.lang.String targetDivIdPerspectiveInfiniteRecursion() {
    return "The content is not displayed to avoid an infinite loop. In general a page must not contain references (directly nor indirectly) to itself. Please double check the configuration of both the navigation tree and the navigation components. Reason:";
  }
  
  public java.lang.String navWidgetTargetDivMissing() {
    return "The target div is either not found or not defined. Please, review the component's configuration.";
  }
  
  public java.lang.String navGroupNotFound() {
    return "The navigation group configured might have been deleted or does not exit. Please, check the configuration of this component.";
  }
  
  public java.lang.String navItemsEmpty() {
    return "No items found";
  }
  
  public java.lang.String openNavItem(java.lang.String arg0) {
    return "Open " + arg0;
  }
  
  public java.lang.String gotoNavItem(java.lang.String arg0) {
    return "Go to " + arg0;
  }
  
  public java.lang.String showNavItem(java.lang.String arg0) {
    return "Show " + arg0;
  }
  
  public java.lang.String navConfigHeader() {
    return "Navigation component configuration";
  }
  
  public java.lang.String navGroupLabel() {
    return "Navigation group";
  }
  
  public java.lang.String navGroupHelp() {
    return "The navigation component will display items from the selected group.";
  }
  
  public java.lang.String navGroupSelectorHint() {
    return "-Select group -";
  }
  
  public java.lang.String defaultItemLabel() {
    return "Default item";
  }
  
  public java.lang.String defaultItemHelp() {
    return "The item (e.g. a page) the navigation component displays by default. If nothing selected then the first item is taken.";
  }
  
  public java.lang.String defaultItemSelectorHint() {
    return "-Select default item -";
  }
  
  public java.lang.String defaultItemsNotFound() {
    return "The selected group has no items";
  }
  
  public java.lang.String targetDivLabel() {
    return "Target div";
  }
  
  public java.lang.String targetDivHelp() {
    return "Every time a navigation item is clicked, the content of its associated page is displayed in the target div component you select.";
  }
  
  public java.lang.String targetDivSelectorHint() {
    return "-Select target div -";
  }
  
  public java.lang.String targetDivsNotFound() {
    return "No target divs defined";
  }
  
  public java.lang.String navItemEditorPerspectiveHelp() {
    return "The page to display when this navigation item is clicked from any navigation component: menu bar, tile navigator, tab list, tree, ...";
  }
  
  public java.lang.String navItemEditorGroupHelp() {
    return "The navigation group to be used by the target page's navigation components. This setting only makes sense when the page selected above contains navigation components.";
  }
  
  public java.lang.String navRefPerspective(java.lang.String arg0) {
    return "The page " + arg0;
  }
  
  public java.lang.String navRefGroupDefined(java.lang.String arg0) {
    return "displaying items from group " + arg0 + ".";
  }
  
  public java.lang.String navRefGroupContext(java.lang.String arg0) {
    return "receiving the " + arg0 + " navigation group.";
  }
  
  public java.lang.String navRefPerspectiveFound(java.lang.String arg0) {
    return "The item points to the page " + arg0 + ".";
  }
  
  public java.lang.String navRefPerspectiveDefault(java.lang.String arg0) {
    return "The item points to the page " + arg0 + ".";
  }
  
  public java.lang.String navRefPerspectiveInGroup(java.lang.String arg0) {
    return "The group contains at least one item linked to the page " + arg0 + ".";
  }
  
  public java.lang.String navRefComponent(java.lang.String arg0) {
    return "contains a " + arg0;
  }
  
  public java.lang.String navRefDefaultItemDefined(java.lang.String arg0) {
    return "The default item defined is " + arg0 + ".";
  }
  
  public java.lang.String navRefDefaultItemFound(java.lang.String arg0) {
    return "The first available item found is " + arg0 + ".";
  }
  
  public java.lang.String navRefPerspectiveRecursionEnd() {
    return "which would cause an infinite loop";
  }
}
