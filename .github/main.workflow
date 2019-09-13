workflow "Build and Test" {
  on = "push"
  resolves = "Code Coverage"
}
