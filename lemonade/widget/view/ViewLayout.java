package lemonade.widget.view;

/* A class which represents the layout of a specific view's elements.
 * View is composed of one ViewLayout instance which should be initialized
 * to the proper dimensions. These dimension corresponds to the view's specific elements count.
 */
public class ViewLayout {

    private int[] _buttonsMarginLeft;
    private int[] _buttonsMarginTop;
    private int[] _buttonsHorizontalSpacing;
    private int[] _buttonsVerticalSpacing;

    private int[] _flavorTextsMarginLeft;
    private int[] _flavorTextsMarginTop;

    private int[] _headersMarginLeft;
    private int[] _headersMarginTop;

    private int[] _imagesMarginLeft;
    private int[] _imagesMarginTop;

    private int[] _labelsMarginLeft;
    private int[] _labelsMarginTop;

    private int[] _subviewsMarginLeft;
    private int[] _subviewsMarginTop;

    private int[] _textVariablesMarginLeft;
    private int[] _textVariablesMarginTop;

    public ViewLayout(int buttonGroupCount, int flavorTextGroupCount, int headerGroupCount, int imageGroupCount,
            int labelGroupCount,
            int textVariableGroupCount, int subviewGroupCount) {
        setButtonGroupCount(buttonGroupCount);
        setFlavorTextGroupCount(flavorTextGroupCount);
        setHeaderGroupCount(headerGroupCount);
        setImageGroupCount(imageGroupCount);
        setLabelGroupCount(labelGroupCount);
        setSubviewGroupCount(subviewGroupCount);
        setTextVariableGroupCount(textVariableGroupCount);
    }

    // Getters

    private int[] getButtonsMarginLeft() {
        return this._buttonsMarginLeft;
    }

    private int[] getButtonsMarginTop() {
        return this._buttonsMarginTop;
    }

    private int[] getButtonsHorizontalSpacing() {
        return this._buttonsHorizontalSpacing;
    }

    private int[] getButtonsVerticalSpacing() {
        return this._buttonsVerticalSpacing;
    }

    private int[] getFlavorTextsMarginLeft() {
        return this._flavorTextsMarginLeft;
    }

    private int[] getFlavorTextsMarginTop() {
        return this._flavorTextsMarginTop;
    }

    private int[] getHeadersMarginLeft() {
        return this._headersMarginLeft;
    }

    private int[] getHeadersMarginTop() {
        return this._headersMarginTop;
    }

    private int[] getImagesMarginLeft() {
        return this._imagesMarginLeft;
    }

    private int[] getImagesMarginTop() {
        return this._imagesMarginTop;
    }

    private int[] getLabelsMarginLeft() {
        return this._labelsMarginLeft;
    }

    private int[] getLabelsMarginTop() {
        return this._labelsMarginTop;
    }

    private int[] getSubviewsMarginLeft() {
        return this._subviewsMarginLeft;
    }

    private int[] getSubviewsMarginTop() {
        return this._subviewsMarginTop;
    }

    private int[] getTextVariablesMarginLeft() {
        return this._textVariablesMarginLeft;
    }

    private int[] getTextVariablesMarginTop() {
        return this._textVariablesMarginTop;
    }

    // Setters

    private void setButtonsMarginLeft(int[] value) {
        this._buttonsMarginLeft = value;
    }

    private void setButtonsMarginTop(int[] value) {
        this._buttonsMarginTop = value;
    }

    private void setButtonsHorizontalSpacing(int[] value) {
        this._buttonsHorizontalSpacing = value;
    }

    private void setButtonsVerticalSpacing(int[] value) {
        this._buttonsVerticalSpacing = value;
    }

    private void setFlavorTextsMarginLeft(int[] value) {
        this._flavorTextsMarginLeft = value;
    }

    private void setFlavorTextsMarginTop(int[] value) {
        this._flavorTextsMarginTop = value;
    }

    private void setHeadersMarginLeft(int[] value) {
        this._headersMarginLeft = value;
    }

    private void setHeadersMarginTop(int[] value) {
        this._headersMarginTop = value;
    }

    private void setImagesMarginLeft(int[] value) {
        this._imagesMarginLeft = value;
    }

    private void setImagesMarginTop(int[] value) {
        this._imagesMarginTop = value;
    }

    private void setLabelsMarginLeft(int[] value) {
        this._labelsMarginLeft = value;
    }

    private void setLabelsMarginTop(int[] value) {
        this._labelsMarginTop = value;
    }

    private void setSubviewsMarginLeft(int[] value) {
        this._subviewsMarginLeft = value;
    }

    private void setSubviewsMarginTop(int[] value) {
        this._subviewsMarginTop = value;
    }

    private void setTextVariablesMarginLeft(int[] value) {
        this._textVariablesMarginLeft = value;
    }

    private void setTextVariablesMarginTop(int[] value) {
        this._textVariablesMarginTop = value;
    }

    // Class methods

    public void setButtonGroupCount(int count) {
        setButtonsMarginLeft(new int[count]);
        setButtonsMarginTop(new int[count]);
        setButtonsHorizontalSpacing(new int[count]);
        setButtonsVerticalSpacing(new int[count]);
    }

    public void setFlavorTextGroupCount(int count) {
        setFlavorTextsMarginLeft(new int[count]);
        setFlavorTextsMarginTop(new int[count]);
    }

    public void setHeaderGroupCount(int count) {
        setHeadersMarginLeft(new int[count]);
        setHeadersMarginTop(new int[count]);
    }

    public void setImageGroupCount(int count) {
        setImagesMarginLeft(new int[count]);
        setImagesMarginTop(new int[count]);
    }

    public void setLabelGroupCount(int count) {
        setLabelsMarginLeft(new int[count]);
        setLabelsMarginTop(new int[count]);
    }

    public void setSubviewGroupCount(int count) {
        setSubviewsMarginLeft(new int[count]);
        setSubviewsMarginTop(new int[count]);
    }

    public void setTextVariableGroupCount(int count) {
        setTextVariablesMarginLeft(new int[count]);
        setTextVariablesMarginTop(new int[count]);
    }

    public void setButtonGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getButtonsMarginLeft()[id] = pixelCountLeft;
        getButtonsMarginTop()[id] = pixelCountTop;
    }

    public void setButtonGroupSpacing(int id, int pixelCountHorizontalSpacing, int pixelCountVerticalSpacing) {
        getButtonsHorizontalSpacing()[id] = pixelCountHorizontalSpacing;
        getButtonsVerticalSpacing()[id] = pixelCountVerticalSpacing;
    }

    public void setFlavorTextGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getFlavorTextsMarginLeft()[id] = pixelCountLeft;
        getFlavorTextsMarginTop()[id] = pixelCountTop;
    }

    public void setHeaderGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getHeadersMarginLeft()[id] = pixelCountLeft;
        getHeadersMarginTop()[id] = pixelCountTop;
    }

    public void setImageGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getImagesMarginLeft()[id] = pixelCountLeft;
        getImagesMarginTop()[id] = pixelCountTop;
    }

    public void setLabelGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getLabelsMarginLeft()[id] = pixelCountLeft;
        getLabelsMarginTop()[id] = pixelCountTop;
    }

    public void setSubviewGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getSubviewsMarginLeft()[id] = pixelCountLeft;
        getSubviewsMarginTop()[id] = pixelCountTop;
    }

    public void setTextVariableGroupMargins(int id, int pixelCountLeft, int pixelCountTop) {
        getTextVariablesMarginLeft()[id] = pixelCountLeft;
        getTextVariablesMarginTop()[id] = pixelCountTop;
    }

    public int getButtonMarginLeft(int id) {
        return getButtonsMarginLeft()[id];
    }

    public int getButtonMarginTop(int id) {
        return getButtonsMarginTop()[id];
    }

    public int getButtonHorizontalSpacing(int id) {
        return getButtonsHorizontalSpacing()[id];
    }

    public int getButtonVerticalSpacing(int id) {
        return getButtonsVerticalSpacing()[id];
    }

    public int getFlavorTextMarginLeft(int id) {
        return getFlavorTextsMarginLeft()[id];
    }

    public int getFlavorTextMarginTop(int id) {
        return getFlavorTextsMarginTop()[id];
    }

    public int getHeaderMarginLeft(int id) {
        return getHeadersMarginLeft()[id];
    }

    public int getHeaderMarginTop(int id) {
        return getHeadersMarginTop()[id];
    }

    public int getImageMarginLeft(int id) {
        return getImagesMarginLeft()[id];
    }

    public int getImageMarginTop(int id) {
        return getImagesMarginTop()[id];
    }

    public int getLabelMarginLeft(int id) {
        return getLabelsMarginLeft()[id];
    }

    public int getLabelMarginTop(int id) {
        return getLabelsMarginTop()[id];
    }

    public int getSubviewMarginLeft(int id) {
        return getSubviewsMarginLeft()[id];
    }

    public int getSubviewMarginTop(int id) {
        return getSubviewsMarginTop()[id];
    }

    public int getTextVariableMarginLeft(int id) {
        return getTextVariablesMarginLeft()[id];
    }

    public int getTextVariableMarginTop(int id) {
        return getTextVariablesMarginTop()[id];
    }
}
