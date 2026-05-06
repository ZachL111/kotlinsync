# Kotlinsync Walkthrough

This note is the quickest way to read the extra review model in `kotlinsync`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | dry-run spread | 187 | ship |
| stress | rename risk | 186 | ship |
| edge | operator cost | 167 | ship |
| recovery | idempotence | 234 | ship |
| stale | dry-run spread | 219 | ship |

Start with `recovery` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `edge` becomes less cautious without a clear reason, I would inspect the drag input first.
